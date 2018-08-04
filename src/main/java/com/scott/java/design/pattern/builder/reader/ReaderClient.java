package com.scott.java.design.pattern.builder.reader;

import org.junit.Test;

/**
 * Created by lizhaok on 5/13/2015.
 */
public class ReaderClient {

    @Test
    public void textASCTwoConverter() {
        TextConverter ascTwoConverter = new ASCTwoConverter();
        RTFReader rtfReader = new RTFReader(ascTwoConverter);
        rtfReader.ParseRTF();
        System.out.println(((ASCTwoConverter)ascTwoConverter).getASCTwoText());
    }

    @Test
    public void testTextWidgetConverter() {
        TextConverter textConverter = new TextWidgetConverter();
        RTFReader rtfReader = new RTFReader(textConverter);
        rtfReader.ParseRTF();
        System.out.println(((TextWidgetConverter)textConverter).getTextWidget());
    }

    @Test
    public void testTeXConverter() {
        TextConverter textConverter = new TeXConverter();
        RTFReader rtfReader = new RTFReader(textConverter);
        rtfReader.ParseRTF();
        System.out.println(((TeXConverter)textConverter).getTeXText());
    }
}
