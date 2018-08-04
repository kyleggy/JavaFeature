package com.scott.java.feature.anonymousclass;

import org.junit.Test;

/**
 * Created by lizhaok on 6/7/2017.
 */
public class AnonymousPerson {

    @Test
    public void testAnonymousClass() {

        Person person = new Person() {
            final static  int a = 10;
            @Override
            void eat() {
                System.out.println("Anonymous eat" + a);
            }
        };
        person.eat();

    }
}
