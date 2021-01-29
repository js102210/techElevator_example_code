package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Less20Tests {
    @Test
    public void isLessThanMultipleOf20_returns_true_for_18(){
        Less20 sut = new Less20();
        boolean result = sut.isLessThanMultipleOf20(18);
        Assert.assertEquals(true, result);

    }
    @Test
    public void isLessThanMultipleOf20_returns_true_for_19(){
        Less20 sut = new Less20();
        boolean result = sut.isLessThanMultipleOf20(19);
        Assert.assertEquals(true, result);

    }
    @Test
    public void isLessThanMultipleOf20_returns_true_for_21(){
        Less20 sut = new Less20();
        boolean result = sut.isLessThanMultipleOf20(21);
        Assert.assertEquals(false, result);

    }

    @Test
    public void isLessThanMultipleOf20_returns_false_for_17(){
        Less20 sut = new Less20();
        boolean result = sut.isLessThanMultipleOf20(17);
        Assert.assertEquals(false, result);

    }
    @Test
    public void isLessThanMultipleOf20_returns_false_for_20(){
        Less20 sut = new Less20();
        boolean result = sut.isLessThanMultipleOf20(20);
        Assert.assertEquals(false, result);

    }
    @Test
    public void isLessThanMultipleOf20_returns_true_for_38(){
        Less20 sut = new Less20();
        boolean result = sut.isLessThanMultipleOf20(38);
        Assert.assertEquals(true, result);

    }
    @Test
    public void isLessThanMultipleOf20_returns_true_for_39(){
        Less20 sut = new Less20();
        boolean result = sut.isLessThanMultipleOf20(39);
        Assert.assertEquals(true, result);

    }

    @Test
    public void isLessThanMultipleOf20_returns_false_for_40(){
        Less20 sut = new Less20();
        boolean result = sut.isLessThanMultipleOf20(40);
        Assert.assertEquals(false, result);

    }

    @Test
    public void isLessThanMultipleOf20_returns_false_for_0(){
        Less20 sut = new Less20();
        boolean result = sut.isLessThanMultipleOf20(0);
        Assert.assertEquals(false, result);

    }


}
