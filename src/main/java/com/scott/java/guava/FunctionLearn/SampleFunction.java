package com.scott.java.guava.FunctionLearn;

import com.google.common.base.Function;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

/**
 * Created by lizhaok on 11/2/2015.
 */
public class SampleFunction {

    @Test
    public void testFunction() {
        List<String> words = Splitter.onPattern(" ").splitToList(
                "Lorem ipsum dolor sit amet consectetur adipisicing elit");

        Function<String, String> toUpper = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase().substring(0, 3);
            }
        };

        List<String> upperThreeWords = Lists.transform(words, toUpper);

        for (String s : upperThreeWords) {
            System.out.println(s);
        }
    }
}
