package com.scott.java.design.pattern.prototype.musicscore;

public class WholeNote implements MusicNote {

    @Override
    public void draw(Position position) {
        System.out.println("Draw a Whole Note with x: " + position.getX() + " and y: " + position.getY());
    }

    @Override
    public Graphic clone() {
        return new WholeNote();
    }
}
