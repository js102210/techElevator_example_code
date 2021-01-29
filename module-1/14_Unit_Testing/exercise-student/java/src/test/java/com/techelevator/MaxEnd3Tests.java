package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MaxEnd3Tests {

    @Test
    public void makeArray_1_2_3_returns_3_3_3(){
        MaxEnd3 sut = new MaxEnd3();
        int[] result = sut.makeArray(new int[]{1,2,3});
        int[] desiredOutArr = new int[] {3, 3, 3};
        boolean arraysAreTheSame = Arrays.equals(desiredOutArr, result);
        Assert.assertTrue(arraysAreTheSame);
    }
    @Test
    public void makeArray_11_5_9_returns_11_11_11(){
        MaxEnd3 sut = new MaxEnd3();
        int[] result = sut.makeArray(new int[] {11,5,9});
        int[] desiredOutArr = new int[] {11,11,11};
        boolean arraysAreTheSame = Arrays.equals(desiredOutArr, result);
        Assert.assertTrue(arraysAreTheSame);
    }
    @Test
    public void makeArray_2_11_3_returns_3_3_3(){
        MaxEnd3 sut = new MaxEnd3();
        int[] result = sut.makeArray(new int[] {2,11,3});
        int[] desiredOutArr = new int[] {3,3,3};
        boolean arraysAreTheSame = Arrays.equals(desiredOutArr, result);
        Assert.assertTrue(arraysAreTheSame);
    }
    @Test
    public void makeArray_1_2_1_returns_1_1_1(){
        MaxEnd3 sut = new MaxEnd3();
        int[] result = sut.makeArray(new int[] {1,2,1});
        int[] desiredOutArr = new int[] {1,1,1};
        boolean arraysAreTheSame = Arrays.equals(desiredOutArr, result);
        Assert.assertTrue(arraysAreTheSame);
    }

}
