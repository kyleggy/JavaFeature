package com.scott.java.design.pattern.structure.flyweight.glyphsample;

/**
 * Created by lizhaok on 12/27/2017.
 */
public class GlyphFactory {
    private static final char NCHARCODES = 128;
    private Character[] character;

    /**
     * Constructs ...
     *
     */
    public GlyphFactory() {
        character = new Character[NCHARCODES];

        /**
         *    for (char i = 0; i < NCHARCODES; i++) {
         *  character[i] = null;
         *    }
         */
    }

    Character createCharacter(char charcode) {
        if (character[charcode] == null) {
            character[charcode] = new Character(charcode);
        }

        return character[charcode];
    }

    Row crateRow() {
        return new Row();
    }

    Column createColumn() {
        return new Column();
    }
}
