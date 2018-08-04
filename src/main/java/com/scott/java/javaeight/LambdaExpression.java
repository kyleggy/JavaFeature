package com.scott.java.javaeight;

import org.junit.Test;

import java.time.LocalDate;
import java.util.Date;
import java.util.function.Function;
import java.util.stream.IntStream;

/**
 * Created by lizhaok on 2016/4/28.
 */
public class LambdaExpression {

    @Test
    public void multipleThread7() {
        for (int i = 0; i <=9 ; i ++) {
            final int j = i;
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(j);

                }
            });
            thread.start();

        }
    }

    @Test
    public void multipleThread8() {
        for (int i = 0; i <=9 ; i ++) {
            final int j = i;
            Thread thread = new Thread(() -> {System.out.println(j);});
            thread.start();
        }
    }


    @Test
    public void testFunction() {
        Function<String, String> hello = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return "Scott Say hello: " + s;
            }
        };

        System.out.println(hello.apply("China"));

    }

    @FunctionalInterface
    interface HelloInterface {
         String sayHello(String s);
    }

    public void callHello(HelloInterface helloInterface, String h) {
        helloInterface.sayHello(h);
    }

    @Test
    public void testHelloInterface() {
        callHello((String a) -> {return a;}, "d");
    }

    @Test
    public void testIntstream() {
        IntStream.range(0, 9).parallel().forEach(System.out::print);
    }


    @Test
    public void testTime() {


        Date now = new Date();
        System.out.println(now.getYear());
        System.out.println(now.getMonth());
        System.out.println(now.getDate());

        LocalDate localDate;


    }
}
