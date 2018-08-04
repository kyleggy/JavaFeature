package com.scott.java.feature.compare;

/**
 * Created by lizhaok on 8/12/2014.
 */
public class HDTV implements Comparable<HDTV>{
    private int size;
    private String brand;

    public HDTV(int size, String brand) {
        this.size = size;
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    @Override
    public int compareTo(HDTV o) {
        if (this.getSize() > o.getSize()) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        HDTV a = new HDTV(42, "Sharp");
        HDTV b = new HDTV(50, "Sony");
        System.out.println(a.compareTo(b));
    }
}
