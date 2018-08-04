package com.scott.java.design.pattern.structure.flyweight.glyphsample;

import java.awt.*;
import java.util.Map;

/**
 * Created by lizhaok on 12/27/2017.
 */
public class GlyphContext {
    private int index;
    private Map<Integer, Font> fonts;

    public GlyphContext() {
        fonts = new java.util.TreeMap();
    }

    void next(int step) {
        index++;
    }

    void insert(int quantity) {}

    Font getFont() {
        return fonts.get(index);
    }

    void setFont(Font font, int span) {}
}
