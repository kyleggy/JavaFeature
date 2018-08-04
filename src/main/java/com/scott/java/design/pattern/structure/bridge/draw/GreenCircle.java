package com.scott.java.design.pattern.structure.bridge.draw;

/**
 * Created by lizhaok on 6/11/2017.
 */
public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
