package com.scott.java.design.pattern.builder.reader;

/**
 * Created by lizhaok on 5/13/2015.
 */
public class RTFReader {
    private TextConverter textConverter;

    public RTFReader(TextConverter textConverter) {
        this.textConverter = textConverter;
    }

    public void ParseRTF() {
        if ("a".equals("a")) {
            textConverter.convertCharacter('a');
        } else if ("a".equals("c")) {
            textConverter.convertFontChange(1);
        } else if ("b".equals("c")) {
            textConverter.convertParagraph("c");
        }
    }

}
