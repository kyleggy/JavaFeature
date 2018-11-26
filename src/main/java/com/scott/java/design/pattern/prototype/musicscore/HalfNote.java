package com.scott.java.design.pattern.prototype.musicscore;

public class HalfNote implements MusicNote {

    @Override
    public void draw(Position position) {
        System.out.println("Draw a Half Note with x: " + position.getX() + " and y: " + position.getY());
    }

    @Override
    public Graphic clone() {
        return new HalfNote();
    }
}
