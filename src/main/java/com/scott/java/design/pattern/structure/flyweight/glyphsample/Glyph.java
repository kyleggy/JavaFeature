package com.scott.java.design.pattern.structure.flyweight.glyphsample;

import java.awt.*;

/**
 * Created by lizhaok on 12/27/2017.
 */

//Reference https://github.com/gperon/designpatterns/blob/master/src/main/java/gamma/designpatterns/structural/flyweight/Glyph.java
public interface Glyph {
    void draw(Window win, GlyphContext context);

    void setFont(Font font, GlyphContext context);

    void first(GlyphContext context);

    void next(GlyphContext context);

    boolean isDone(GlyphContext context);

    Glyph current(GlyphContext context);

    void insert(Glyph glyph, GlyphContext context);

    void remove(GlyphContext context);

}
