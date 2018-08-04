package com.scott.java.feature.compare;

import java.util.TreeSet;

/**
 * Created by lizhaok on 8/13/2014.
 */
class Dogs implements Comparable<Dogs>{
    int size;

    Dogs(int s) {
        size = s;
    }

    @Override
    public int compareTo(Dogs o) {
        return o.size - this.size;
    }
}

public class ImpComparable {
    public static void main(String[] args) {
        TreeSet<Dogs> d = new TreeSet<Dogs>();
        d.add(new Dogs(1));
        d.add(new Dogs(2));
        d.add(new Dogs(1));
        System.out.println(d);
    }
}
