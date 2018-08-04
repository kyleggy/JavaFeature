package com.scott.java.feature.collections;

import com.google.common.collect.Sets;
import org.junit.Assert;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by lizhaok on 8/14/2014.
 */
public class TreeSetExample {
    /*
    Java TreeSet is an ordered and sorted set of the objects which does not allow duplicates and allows null value.

It is possible to create your own rules how to sort objects using Comparator interface or Comparable interface.
If you did not use your own sort order rules, elements are sorted in ascending order, according to the natural order of the elements.

Natural order is defined by the class of the object being sorted (Integer objects are sorted by numeric value, String objects by alphabetical order…).

- See more at: http://www.javacodeexamples.com/treeset
     */
    public static void main(String[] args) {
        HashSet<String> set01 = new HashSet<>();
        set01.add("123");
        set01.add(null);

        HashSet<String> set02 = new HashSet<>();
        set01.add(null);
        set01.add("123");

        Assert.assertEquals(set02, set01);


        TreeSet<String> set = new TreeSet<String>();
        set.add("C");
        set.add("B");
        set.add("A");
        set.add("E");
        set.add("D");
        System.out.println("Set elements:");
        for(String s : set){
            System.out.println("-" + s);
        }
        System.out.println("Set size:" + set.size());
        System.out.println("First element is: " + set.first());
        System.out.println("Last element is: " + set.last());
        System.out.println("Removing element 'D'...");
        set.remove("D");
        System.out.println("Set size:" + set.size());
        System.out.println("Set elements:");
        //iterating by iterator
        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            String s = i.next();
            System.out.println("-" + s);
        }
        System.out.println("Set contains object 'B'? "
                + set.contains("B"));

        System.out.println("Removing all elements...");
        set.clear();
        System.out.println("Set is empty now? " + set.isEmpty());
        set.add(null); //allows null value
    }
}
