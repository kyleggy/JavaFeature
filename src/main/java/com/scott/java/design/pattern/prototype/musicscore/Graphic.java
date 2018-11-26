package com.scott.java.design.pattern.prototype.musicscore;

public interface Graphic {

    void draw(Position position);

    Graphic clone();
}
