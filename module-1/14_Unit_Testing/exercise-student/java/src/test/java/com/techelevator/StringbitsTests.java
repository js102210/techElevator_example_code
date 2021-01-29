package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class StringbitsTests {
    @Test
    public void getBits_Hello_returns_Hlo(){
        StringBits sut = new StringBits();
        String result = sut.getBits("Hello");
        Assert.assertEquals("Hlo", result);
    }
    @Test
    public void getBits_Hi_returns_H(){
        StringBits sut = new StringBits();
        String result = sut.getBits("Hi");
        Assert.assertEquals("H", result);
    }
    @Test
    public void getBits_H_returns_H(){
        StringBits sut = new StringBits();
        String result = sut.getBits("H");
        Assert.assertEquals("H", result);
    }
    @Test
    public void getBits_Heeololeo_returns_Hello(){
        StringBits sut = new StringBits();
        String result = sut.getBits("Heeololeo");
        Assert.assertEquals("Hello", result);
    }
    @Test
    public void getBits_Heeololeoe_returns_Hello(){
        StringBits sut = new StringBits();
        String result = sut.getBits("Heeololeoe");
        Assert.assertEquals("Hello", result);
    }
    @Test
    public void getBits_empty_string_returns_empty_string(){
        StringBits sut = new StringBits();
        String result = sut.getBits("");
        Assert.assertEquals("", result);
    }
    @Test
    public void getBits_null_returns_empty_string(){
        StringBits sut = new StringBits();
        String result = sut.getBits(null);
        Assert.assertEquals("", result);
    }
}
