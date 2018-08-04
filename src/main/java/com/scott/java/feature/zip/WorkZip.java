package com.scott.java.feature.zip;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import sun.misc.IOUtils;


import javax.xml.namespace.NamespaceContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.*;
import java.io.*;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * Created by lizhaok on 5/13/2015.
 */
public class WorkZip {

    private static String inputFilePath = "D:\\zipdir\\ums-10-10-package.zip";
    private static final String OUTPUT_DIR = "D:\\zipdir\\";
    private static final int BUFFER_SIZE = 8192;
    private static final String QUERY_NAME_XPATH = "/integration/targetcis/source_instance_type";
    private static final String QUERY_NAME = "query-name";
    private static final String TQL_NAME_XPATH = "/XmlResourceWrapper/resource[@type='tql:Query']";
    //name="SACM Load Balancer Cluster Resource Group Push"
    private static final String TQL_NAME = "name";

    public static void main(String[] args) throws IOException {
       readUsingZipFile();
      //readUsingZipInputStream();
    }

    private static void readUsingZipFile() throws IOException
    {
        final ZipFile zipFile = new ZipFile(inputFilePath);
        ByteArrayOutputStream summaryOutputStream = new ByteArrayOutputStream();
        //OutputStream summaryOutputStream = new ByteArrayOutputStream();
        System.out.println("Iterating over zip file : " + inputFilePath);
        try {
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                int data;
                ZipEntry entry = entries.nextElement();
                InputStream stream = zipFile.getInputStream(entry);
                if (entry.getName().endsWith(".xml")) {
                    System.out.printf("File: %s Size %d Modified on %TD %n", entry.getName(), entry.getSize(), new Date(entry.getTime()));



                    Document document = createDocument(stream);
                    document.getDocumentElement().normalize();


                    updateXMLProperty(document, QUERY_NAME_XPATH, QUERY_NAME, "new-value", true);
                    updateXMLProperty(document, TQL_NAME_XPATH, TQL_NAME, "new-value", false);

                    //convertDocumentToXml(document);

                    ByteArrayOutputStream outputStream = convertDocumentToByte(document);
                    outputStream.writeTo(summaryOutputStream);


                    //System.out.println(outputStream.toString());

//                    String s = convertDocumentToXml(document);
//
//                    byte buff[] = s.getBytes();
//                    ByteArrayOutputStream f = new ByteArrayOutputStream();
//                    f.write(buff);
//
//                    System.out.println(f.toString());


                    //updateQueryNameOnMappingXML(document, xPath);

                    //System.out.println(getStringFromDocument(document));
                } else {
                   while((data =stream.read()) != -1)
                   {
                       ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data);
                       outputStream.writeTo(summaryOutputStream);

                   }
                }
                //extractEntry(entry, file.getInputStream(entry));
            }
            System.out.print(summaryOutputStream);
            System.out.printf("Zip file %s extracted successfully in %s", inputFilePath, OUTPUT_DIR);
        } finally
        { zipFile.close(); }
    }

    private static void updateQueryNameOnMappingXML(Document document, XPath xPath, String xpathValue) {
        try {
            XPathExpression xPathExpression = xPath.compile(QUERY_NAME_XPATH);
            Node queryNameNode = (Node) xPathExpression.evaluate(document, XPathConstants.NODE);
            if (queryNameNode != null) {
                NamedNodeMap attributes = queryNameNode.getAttributes();
                if (attributes.getNamedItem(QUERY_NAME) != null ) {
                    String newQueryNameValue = "new_value" + attributes.getNamedItem(QUERY_NAME).getNodeValue();
                    attributes.getNamedItem(QUERY_NAME).setNodeValue(newQueryNameValue);


                    System.out.println(getStringFromDocument(document));

                }
            }
//                        else {
//                            System.out.println("The following xml not analzyed:" + getStringFromDocument(document));
//                        }


//

            //updateExistingProperties(doc, nodes, maasPropertyToUcmdbProperty, xPath);
        } catch (XPathExpressionException e) {
            throw new RuntimeException();

        }

    }

    public static ByteArrayOutputStream convertDocumentToByte(Document doc) {
        DOMSource domSource = new DOMSource(doc);
        ByteArrayOutputStream writer = new ByteArrayOutputStream();
        StreamResult result = new StreamResult(writer);
        TransformerFactory tf = TransformerFactory.newInstance();
        try {
            Transformer transformer = tf.newTransformer();
            transformer.transform(domSource, result);
        } catch (TransformerException e) {
            throw new RuntimeException("Failed to convert doc [" + doc + "] into string", e);
        }

        return writer;
    }

    private static void updateNameOnTQL(Document document, String xPathValue, String updateAttributeName, String updateValue, Boolean isUpdateValuePrefix) {
        updateXMLProperty(document, xPathValue, updateAttributeName, updateValue, isUpdateValuePrefix);
    }



    private static void updateXMLProperty(Document document, String xPathValue, String updateAttributeName, String updateValue, Boolean isUpdateValuePrefix) {
        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xPath = xPathFactory.newXPath();

        try {
            //namespace uri is used by the tql xml for identifying the xpath
            NamespaceContext namespaceContext = new NamespaceContext() {
                @Override
                public String getNamespaceURI(String prefix) {
                    if(prefix.equals("xsi")) {
                        return "http://www.w3.org/2001/XMLSchema-instance";
                    } else if (prefix.equals("resource")) {
                        return "http://www.hp.com/ucmdb/1-0-0/ResourceDefinition";
                    }
                    return null;
                }

                @Override
                public String getPrefix(String namespaceURI) {
                    return null;
                }

                @Override
                public Iterator getPrefixes(String namespaceURI) {
                    return null;
                }
            };
            xPath.setNamespaceContext(namespaceContext);
            XPathExpression xPathExpression = xPath.compile(xPathValue);

            Node queryNameNode = (Node) xPathExpression.evaluate(document, XPathConstants.NODE);
            if (queryNameNode != null) {
                NamedNodeMap attributes = queryNameNode.getAttributes();
                Node attributeValue = attributes.getNamedItem(updateAttributeName);
                if (attributeValue != null) {
                    updateNodeValue(attributeValue, updateValue, isUpdateValuePrefix);
                }
            }
        } catch (XPathExpressionException e) {
            throw new RuntimeException();
        }
    }

    private static void updateNodeValue(Node attributeValue, String updateValue, Boolean isUpdateValuePrefix) {
        String newQueryValue;
        if (isUpdateValuePrefix) {
            newQueryValue = updateValue + attributeValue.getNodeValue();
        } else {
            newQueryValue = attributeValue.getNodeValue() + updateValue;
        }
        attributeValue.setNodeValue(newQueryValue);
    }



    public static String getStringFromDocument(Document doc)  {
        DOMSource domSource = new DOMSource(doc);
        StringWriter writer = new StringWriter();
        StreamResult result = new StreamResult(writer);
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = null;
        try {
            transformer = tf.newTransformer();
            transformer.transform(domSource, result);
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }

        return writer.toString();
    }

    private static void readUsingZipInputStream() throws IOException {
        BufferedInputStream bis = null;
        ZipInputStream zis = null;
        ByteArrayOutputStream outputStream = null;
        ZipOutputStream zos = null;
        ZipEntry entry;
        try {

            bis =  new BufferedInputStream(new FileInputStream(inputFilePath));
            zis = new ZipInputStream(bis);
            outputStream = new ByteArrayOutputStream();
            zos =  new ZipOutputStream(outputStream);
            while ((entry = zis.getNextEntry())!= null) {
                entry = zis.getNextEntry();
                int data;
                if (entry.getName().endsWith(".xml")) {
                    //InputStream inputStream = zis;
                    Document document = createDocument(zis);
                    updateXMLProperty(document, QUERY_NAME_XPATH, QUERY_NAME, "new-value", true);
                    updateXMLProperty(document, TQL_NAME_XPATH, TQL_NAME, "new-value", false);

                    System.out.println(getStringFromDocument(document));

                    System.out.printf("File: %s Size %d Modified on %TD %n", entry.getName(), entry.getSize(), new Date(entry.getTime()));

                }  else {
                    while ((data = zis.read()) != -1) {
                        zos.write(data);
                    }
                }
                zos.closeEntry();
            }
        } finally {
            try {
                if (zis != null) {
                    zis.close();
                }
                if (zos != null) {
                    zos.close();
                }
            } catch (IOException e) {
                throw new RuntimeException("Could not close io stream", e);
            }
        }
    }

    protected static Document createDocument(InputStream is) {
        Document doc;
        try {
            DocumentBuilderFactory xmlFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = xmlFactory.newDocumentBuilder();
            doc = docBuilder.parse(is);
        } catch (ParserConfigurationException | SAXException | IOException e) {
                throw new RuntimeException();
        }
        return doc;
    }

    private static String convertDocumentToXml(Document doc) {
        DOMSource domSource = new DOMSource(doc);
        StringWriter writer = new StringWriter();
        StreamResult result = new StreamResult(writer);
        TransformerFactory tf = TransformerFactory.newInstance();
        try {
            Transformer transformer = tf.newTransformer();
            transformer.transform(domSource, result);
        } catch (TransformerException e) {
            throw new RuntimeException("Failed to convert doc [" + doc + "] into string", e);
        }
        return writer.toString();
    }

    private static void extractEntry(final ZipEntry entry, InputStream is) throws IOException {
        String exractedFile = OUTPUT_DIR + entry.getName();
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(exractedFile);
            final byte[] buf = new byte[BUFFER_SIZE];
            int read = 0;
            int length;
            while ((length = is.read(buf, 0, buf.length)) >= 0) {
                fos.write(buf, 0, length); }
        } catch (IOException ioex)
        { fos.close(); }
    }

    private String convertInputStreamToString(File file) {
        String expectString = "";
        try {
            InputStream targetStream = new FileInputStream(file);
            byte[] fileData = new byte[targetStream.available()];
            targetStream.read(fileData);
            targetStream.close();

            expectString = new String(fileData);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
        return expectString;
    }





}
