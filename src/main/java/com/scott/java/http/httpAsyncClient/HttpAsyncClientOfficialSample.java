package com.scott.java.http.httpAsyncClient;

import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;
import org.apache.http.nio.IOControl;
import org.apache.http.nio.client.HttpAsyncClient;
import org.apache.http.nio.client.methods.AsyncCharConsumer;
import org.apache.http.nio.client.methods.HttpAsyncMethods;
import org.apache.http.nio.protocol.HttpAsyncRequestProducer;
import org.apache.http.protocol.HttpContext;
import org.junit.Test;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Created by lizhaok on 2016/7/21.
 */
public class HttpAsyncClientOfficialSample {

    @Test
    public void testHttpClient() {
        CloseableHttpAsyncClient httpClient = HttpAsyncClients.createDefault();
        try {
            //Start the client
            httpClient.start();

            //Execute request
            final HttpGet request1 = new HttpGet("http://www.apache.org/");
            Future<HttpResponse> future = httpClient.execute(request1, null);

            // and wait until a response is received
            HttpResponse response1 = future.get();
            System.out.println(request1.getRequestLine() + "->" + response1.getStatusLine());

            final CountDownLatch latch1 = new CountDownLatch(1);
            final HttpGet request2 = new HttpGet("http://www.apache.org/");
            httpClient.execute(request2, new FutureCallback<HttpResponse>() {
                @Override
                public void completed(HttpResponse result) {
                    latch1.countDown();
                    System.out.println(request2.getRequestLine() + "->" + result.getStatusLine());
                }

                @Override
                public void failed(Exception ex) {
                    latch1.countDown();
                    System.out.println(request2.getRequestLine() + "->" + ex);
                }

                @Override
                public void cancelled() {
                    latch1.countDown();
                    System.out.println(request2.getRequestLine() + " cancelled");

                }
            });
            System.out.println("hello1");
            latch1.await();

            final CountDownLatch latch2 = new CountDownLatch(1);
            final HttpGet request3 = new HttpGet("http://www.apache.org");
            HttpAsyncRequestProducer producer3 = HttpAsyncMethods.create(request3);
            AsyncCharConsumer<HttpResponse> consumer3 = new AsyncCharConsumer<HttpResponse>() {

                HttpResponse response;
                @Override
                protected void onCharReceived(CharBuffer charBuffer, IOControl ioControl) throws IOException {

                }

                @Override
                protected void onResponseReceived(HttpResponse httpResponse) throws HttpException, IOException {
                    this.response = httpResponse;

                }

                @Override
                protected HttpResponse buildResult(HttpContext httpContext) throws Exception {
                    return this.response;
                }
            };
            httpClient.execute(producer3, consumer3, new FutureCallback<HttpResponse>() {
                @Override
                public void completed(HttpResponse result) {
                    latch2.countDown();
                    System.out.println(request2.getRequestLine() + "->" + result.getStatusLine() );
                }

                @Override
                public void failed(Exception ex) {
                    latch2.countDown();
                    System.out.println(request2.getRequestLine() + "->" + ex);
                }

                @Override
                public void cancelled() {
                    latch2.countDown();
                    System.out.println(request2.getRequestLine() + " cancelled");
                }
            });
            latch2.await();



        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }



}
