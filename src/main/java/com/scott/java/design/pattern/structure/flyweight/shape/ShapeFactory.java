package com.scott.java.design.pattern.structure.flyweight.shape;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lizhaok on 12/24/2017.
 */
public class ShapeFactory {
    private static final Map<String, Shape> circleMap = new HashMap();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }

}
