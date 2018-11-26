package com.scott.java.design.pattern.prototype.musicscore;

public class Staff implements Graphic {

    @Override
    public void draw(Position position) {
        System.out.println("Draw a Staff with x: " + position.getX() + " and y: " + position.getY());
    }

    @Override
    public Graphic clone() {
        return new Staff();
    }
}
