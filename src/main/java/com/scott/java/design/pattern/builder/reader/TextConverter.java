package com.scott.java.design.pattern.builder.reader;

/**
 * Created by lizhaok on 5/6/2015.
 */
public interface TextConverter {

    public void convertCharacter(char ch);

    public void convertFontChange(int font);

    public void convertParagraph(String paragraph);


}
