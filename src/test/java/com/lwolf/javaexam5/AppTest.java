package com.lwolf.javaexam5;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import sun.applet.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {

    List<Integer> list = new ArrayList<>(Arrays.asList(13, 10, 7));
    int expectedSum = 30;

    /*List<Integer> list = new ArrayList<>(Arrays.asList(21, 6, 34));
    int expectedSum = 61;*/


    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    public void testMain() {
        String[] method=new String[0];
        /*String[] method={"for"};
        String[] method={"while"};
        String[] method={"recursion"};
        String[] method={"somethingElse"};*/
        App.main(method);
    }

    public void testSum_withArgumentFor() {
        String expectedString = "Sum with for: " + expectedSum;
        String actualString = App.sum(list, "for");
        assertEquals(expectedString, actualString);
    }

    public void testSum_withArgumentWhile() {
        String expectedString = "Sum with while: " + expectedSum;
        String actualString = App.sum(list, "while");
        assertEquals(expectedString, actualString);
    }

    public void testSum_withArgumentRecursion() {
        String expectedString = "Sum with recursion: " + expectedSum;
        String actualString = App.sum(list, "recursion");
        assertEquals(expectedString, actualString);
    }

    public void testSum_withInvalidArgument() {
        String expectedString = "Addition method not supported";
        String actualString = App.sum(list, "");
        assertEquals(expectedString, actualString);
    }

    public void testSumWithFor() {
        int sum = App.sumWithFor(list);
        assertEquals(expectedSum, sum);
    }

    public void testSumWithWhile() {
        int sum = App.sumWithWhile(list);
        assertEquals(expectedSum, sum);
    }

    public void testSumWithRecursion() {
        int sum = App.sumWithRecursion(list);
        assertEquals(expectedSum, sum);
    }

}
