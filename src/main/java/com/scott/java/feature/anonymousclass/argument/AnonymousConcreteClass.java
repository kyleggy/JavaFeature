package com.scott.java.feature.anonymousclass.argument;

import org.junit.Test;

import java.util.Enumeration;
import java.util.LinkedList;

/**
 * Created by lizhaok on 6/9/2017.
 */
public class AnonymousConcreteClass {

    public java.util.Enumeration enumerate() {
        LinkedList head = new LinkedList();
        return new Enumeration() {
            LinkedList current; ;
            { current = head; }  // Replace constructor with an instance initializer
            public boolean hasMoreElements() {  return (current != null); }
            public Object nextElement() {
                if (current == null) throw new java.util.NoSuchElementException();
                Object value = current;

                return value;
            }
        };  // Note the required semicolon: it terminates the return statement

    }

    @Test
    public void test (){

        BaseClass baseClass = new BaseClass("hello") {
            @Override
            public void Hello() {
                System.out.println("SAY" );
                super.Hello();
            }
        };
        baseClass.Hello();

    }
}
