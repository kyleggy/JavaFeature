package com.scott.java.design.pattern.prototype.musicscore;

import java.util.HashMap;
import java.util.Map;

public class GraphicProtoTypeFactory {
    private static final Map<String, Graphic> graphicMap = new HashMap<>();

    static {
        graphicMap.put("Staff", new Staff());
        graphicMap.put("HalfNote", new HalfNote());
        graphicMap.put("WholeNote", new WholeNote());
    }

    public static Graphic getMusicGraphic(String graphicName) {
        try {
            return graphicMap.get(graphicName).clone();
        } catch (NullPointerException ex) {
            System.out.println("Prototype with name: " + graphicName + " doesn't exist");
            return null;
        }

    }


}
