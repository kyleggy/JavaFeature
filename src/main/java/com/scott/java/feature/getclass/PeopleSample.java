package com.scott.java.feature.getclass;

import org.junit.Assert;

/**
 * Created by lizhaok on 3/29/2017.
 */
public class PeopleSample {

    public static void main(String[] args) {
        PeopleSample people1 = new PeopleSample();
        PeopleSample people2 = new PeopleSample();
        Assert.assertEquals(true, people1.getClass() == people2.getClass());
    }
}
