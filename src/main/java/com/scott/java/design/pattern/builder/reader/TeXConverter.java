package com.scott.java.design.pattern.builder.reader;

/**
 * Created by lizhaok on 5/13/2015.
 */
public class TeXConverter implements TextConverter {
    private String teXText;

    @Override
    public void convertCharacter(char ch) {
        teXText = "teX text";

    }

    @Override
    public void convertFontChange(int font) {

    }

    @Override
    public void convertParagraph(String paragraph) {

    }

    public String getTeXText() {
        return teXText;
    }
}
