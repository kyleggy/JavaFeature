package com.scott.java.feature.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by lizhaok on 8/12/2014.
 */
public class SizeComparator implements Comparator<HDTVC> {

    @Override
    public int compare(HDTVC o1, HDTVC o2) {
        if (o1.getSize() > o2.getSize()) {
            return 1;
        } else if (o1.getSize() < o2.getSize()) {
            return -1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        HDTVC a = new HDTVC(52, "Sharp");
        HDTVC b = new HDTVC(40, "Sony");
        HDTVC c = new HDTVC(50, "ChangHong");

        ArrayList<HDTVC> al = new ArrayList<HDTVC>();
        al.add(a);
        al.add(b);
        al.add(c);

        Collections.sort(al, new SizeComparator());
        for (HDTVC e : al) {
            System.out.println(e.getBrand());
        }
    }

}
