package com.scott.java.guava.PredicateLearn;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by lizhaok on 11/2/2015.
 */
public class SamplePredicate {

    @Test
    public  void Predicate() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        for (int i : numbers) {
            if (isEven(i)) {
                process(i);
            }
        }

        Predicate<Integer> isEven = new Predicate<Integer>() {
            @Override
            public boolean apply(Integer integer) {
                return (integer % 2) == 0;
            }
        };

        Iterable<Integer> evenNumbers = Iterables.filter(numbers, isEven);

        for (int i : evenNumbers) {
            process(i);
        }

        if (isAllPositive(numbers)) {
            System.out.println("Yep!");
        }

        Predicate<Integer> isPositive = new Predicate<Integer>() {
            @Override
            public boolean apply(Integer integer) {
                return integer > 0;
            }
        };

        List<Integer> predicateNumbers = Arrays.asList(1, 2, 3, 4, -1);

        if (Iterables.all(predicateNumbers, isPositive)) {
            System.out.println("Yep!");
        } else {
            System.out.println("No");
        }

    }

    static void process(int n) {
        System.out.println(n);
    }

    static boolean isEven(int num) {
        return (num %2) == 0;
    }

    static boolean isAllPositive(Iterable<Integer> numbers) {
        for ( int num : numbers) {
            if (num > 0) {
                return true;
            }
        }
        return false;
    }
}
