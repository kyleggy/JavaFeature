package com.scott.java.design.pattern.builder.reader;

/**
 * Created by lizhaok on 5/13/2015.
 */
public class ASCTwoConverter implements TextConverter {
    String ascTwoText;
    @Override
    public void convertCharacter(char ch) {
        ascTwoText = "HI";
    }

    @Override
    public void convertFontChange(int font) {

    }

    @Override
    public void convertParagraph(String paragraph) {

    }

    public String getASCTwoText() {
        return ascTwoText;
    }
}
