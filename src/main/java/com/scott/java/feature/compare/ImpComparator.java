package com.scott.java.feature.compare;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by lizhaok on 8/13/2014.
 */
class Dog {
    int size;

    Dog(int s) {
        size = s;
    }
}

class DogSizeComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        return o1.size - o2.size;
    }
}
public class ImpComparator {
    public static void main(String[] args) {
        TreeSet<Dog> dogTreeSet  = new TreeSet<Dog>(new DogSizeComparator());
        dogTreeSet.add(new Dog(3));
        dogTreeSet.add(new Dog(1));
        dogTreeSet.add(new Dog(2));



    }



}
