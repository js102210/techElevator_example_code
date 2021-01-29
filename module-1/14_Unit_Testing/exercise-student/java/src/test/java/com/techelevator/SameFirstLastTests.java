package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SameFirstLastTests {
    @Test
    public void isItTheSame_array_with_one_entry_returns_true(){
        SameFirstLast sut = new SameFirstLast();
        boolean result = sut.isItTheSame(new int[]{1});
        Assert.assertTrue(result);
    }
    @Test
    public void isItTheSame_array_1_2_1_returns_true(){
        SameFirstLast sut = new SameFirstLast();
        boolean result = sut.isItTheSame(new int[]{1,2,1});
        Assert.assertTrue(result);
    }
    @Test
    public void isItTheSame_array_0_1_2_3_0_returns_true(){
        SameFirstLast sut = new SameFirstLast();
        boolean result = sut.isItTheSame(new int[]{0,1,2,3,0});
        Assert.assertTrue(result);
    }
    @Test
    public void isItTheSame_array_1_1_2_3_0_returns_false(){
        SameFirstLast sut = new SameFirstLast();
        boolean result = sut.isItTheSame(new int[]{1,1,2,3,0});
        Assert.assertFalse(result);
    }
    @Test
    public void isItTheSame_empty_array_returns_false(){
        SameFirstLast sut = new SameFirstLast();
        boolean result = sut.isItTheSame(new int[]{});
        Assert.assertFalse(result);
    }

}
