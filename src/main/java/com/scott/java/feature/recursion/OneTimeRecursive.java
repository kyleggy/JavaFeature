package com.scott.java.feature.recursion;

import org.junit.Test;

/**
 * Created by lizhaok on 6/5/2017.
 */
public class OneTimeRecursive {

    public boolean recursiveOneTime (int n) {
       return recursiveOneTime(n, true);
    }

    private boolean recursiveOneTime(int n, boolean shouldRun) {
        n++;
        if (n > 5) {
            return true;
        }
        if (shouldRun) {
            return recursiveOneTime(n, false);
        }
        return false;
    }

    public static void main(String[] args) {
        OneTimeRecursive oneTimeRecursive = new OneTimeRecursive();
        System.out.println(oneTimeRecursive.recursiveOneTime(3));

    }







}
