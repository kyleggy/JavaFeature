package com.scott.java.javaeight;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

@FunctionalInterface
interface Calculable {
    public double calculate(double a, double b);
}

/**
 * Created by lizhaok on 2016/4/28.
 */
public class LambdaCalculable {

    @Test
    public void testCalculable() {
        Map <String,Calculable> calculatorFactory=new HashMap<>();
        calculatorFactory.put("add", (double a, double b) -> {return  a + b;});
        System.out.println(calculatorFactory.get("add").calculate(12, 23));


    }

}
