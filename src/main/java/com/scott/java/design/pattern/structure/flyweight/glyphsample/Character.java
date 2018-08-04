package com.scott.java.design.pattern.structure.flyweight.glyphsample;

import java.awt.*;

/**
 * Created by lizhaok on 12/27/2017.
 */
public class Character implements Glyph {
    private char charcode;

    public Character(char charcode) {
        this.charcode = charcode;
    }

    @Override
    public void draw(Window win, GlyphContext context) {

    }

    @Override
    public void setFont(Font font, GlyphContext context) {

    }

    @Override
    public void first(GlyphContext context) {

    }

    @Override
    public void next(GlyphContext context) {

    }

    @Override
    public boolean isDone(GlyphContext context) {
        return false;
    }

    @Override
    public Glyph current(GlyphContext context) {
        return null;
    }

    @Override
    public void insert(Glyph glyph, GlyphContext context) {

    }

    @Override
    public void remove(GlyphContext context) {

    }
}
