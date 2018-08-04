package com.scott.java.guava;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by lizhaok on 9/18/2014.
 */
public class MultimapLearn {

    @Test
    public void testArrayListMultiMap() {
        ArrayListMultimap<String, String> scottMultiMap = ArrayListMultimap.create();
        scottMultiMap.put("Scott", "1");
        scottMultiMap.put("Scott", "2");
        scottMultiMap.put("Scott", "3");
        List<String> expected = Lists.newArrayList("1", "2", "3");
        Assert.assertEquals(expected, scottMultiMap.get("Scott"));

    }
}
