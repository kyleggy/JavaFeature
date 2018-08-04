package com.scott.java.design.pattern.builder.reader;

/**
 * Created by lizhaok on 5/13/2015.
 */
public class TextWidgetConverter implements TextConverter {

    private String textWidget;
    @Override
    public void convertCharacter(char ch) {
        textWidget = "text widget";

    }

    @Override
    public void convertFontChange(int font) {

    }

    @Override
    public void convertParagraph(String paragraph) {

    }

    public String getTextWidget() {
        return textWidget;
    }
}
