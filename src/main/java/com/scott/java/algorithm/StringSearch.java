package com.scott.java.algorithm;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by lizhaok on 2015/12/22.
 */
public class StringSearch {

    //http://javahungry.blogspot.com/2014/12/5-ways-to-reverse-string-in-java-with-example.html

    @Test
    public void test() {
        String words = "hellotestchinatestgototest";
        String test = "test";
        int lengthTest = test.length();
        char[] charsTest = test.toCharArray();
        int lengthWords = words.length();
        char[] charsWords = words.toCharArray();
        int i, j;
        for (i = 0; i < lengthWords-1; i ++) {
              for (j = 0; j < lengthTest-1; j ++) {
                  if (charsWords[i+j] != charsTest[j])
                      break;
              }
              if (j == lengthTest-1) {
                  System.out.println(i);
              }

        }

    }

    @Test
    public void testRevert() {
        String input = "Be in present";
        char[] temparray= input.toCharArray();
        int left,right=0;
        right=temparray.length-1;
        for (left=0; left < right ; left++ ,right--)
        {
            // Swap values of left and right
            char temp = temparray[left];
            temparray[left] = temparray[right];
            temparray[right]=temp;
        }
        for (char c : temparray)
            System.out.print(c);
        System.out.println();
    }

    @Test
    public void testVersion() {
        String s = "TargetSet.12345.1";
        String version = getTargetSetIdFromTargetSetWorkflowVersion(s);
        Assert.assertEquals(version, "12345");

    }

    private String getTargetSetIdFromTargetSetWorkflowVersion(String parentTargetSetWorkflowVersion) {
        //TargetSet.12345.1
        int lastDotIndex = parentTargetSetWorkflowVersion.lastIndexOf(".");
        int firstDotIndex = parentTargetSetWorkflowVersion.indexOf(".");
        return parentTargetSetWorkflowVersion.substring(firstDotIndex + 1, lastDotIndex);
    }



}
