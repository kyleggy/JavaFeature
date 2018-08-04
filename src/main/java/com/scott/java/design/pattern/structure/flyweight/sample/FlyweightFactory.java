package com.scott.java.design.pattern.structure.flyweight.sample;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lizhaok on 12/24/2017.
 */
public class FlyweightFactory {
    private static Map<String, FlyWeight> flyWeights = new HashMap<>();

    public static FlyWeight getFlyweight(String key) {
        if (flyWeights.containsKey(key)) {
            System.out.println("Fly weight already exists: " + flyWeights.get(key));
            return flyWeights.get(key);
        }
        else {
            FlyWeight flyWeight = new ConcreteFlyWeight(key);
            flyWeights.put(key, flyWeight);
            return flyWeight;
        }
    }

}
