package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Lucky13Tests {

    @Test
    public void getLucky_0_2_4_returns_true() {
        Lucky13 sut = new Lucky13();
        int[] arrayToTest = new int[]{0,2,4};
        boolean result = sut.getLucky(arrayToTest);
        Assert.assertEquals(true, result);
    }

    @Test
    public void getLucky_1_2_3_returns_false() {
        Lucky13 sut = new Lucky13();
        int[] arrayToTest = new int[]{1,2,3};
        boolean result = sut.getLucky(arrayToTest);
        Assert.assertEquals(false, result);
    }
    @Test
    public void getLucky_1_2_4_returns_false() {
        Lucky13 sut = new Lucky13();
        int[] arrayToTest = new int[]{1,2,4};
        boolean result = sut.getLucky(arrayToTest);
        Assert.assertEquals(false, result);
    }
    @Test
    public void getLucky_empty_array_returns_true() {
        Lucky13 sut = new Lucky13();
        int[] arrayToTest = new int[]{};
        boolean result = sut.getLucky(arrayToTest);
        Assert.assertEquals(true, result);
    }
    @Test
    public void getLucky_null_returns_true() {
        Lucky13 sut = new Lucky13();
        int[] arrayToTest = null;
        boolean result = sut.getLucky(arrayToTest);
        Assert.assertEquals(true, result);
    }
    @Test
    public void getLucky_0_2_4_1_returns_false() {
        Lucky13 sut = new Lucky13();
        int[] arrayToTest = new int[]{0,2,4,1};
        boolean result = sut.getLucky(arrayToTest);
        Assert.assertEquals(false, result);
    }
    @Test
    public void getLucky_0_2_4_0_returns_true() {
        Lucky13 sut = new Lucky13();
        int[] arrayToTest = new int[]{0,2,4,0};
        boolean result = sut.getLucky(arrayToTest);
        Assert.assertEquals(true, result);
    }



}
