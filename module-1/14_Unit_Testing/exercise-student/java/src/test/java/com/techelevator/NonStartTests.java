package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class NonStartTests {

    @Test
    public void getPartialString_returns_ellohere_from_Hello_There() {
        NonStart sut = new NonStart();
        String result = sut.getPartialString("Hello", "There");
        Assert.assertEquals("ellohere", result);
    }
    @Test
    public void getPartialString_returns_avaode_from_java_code() {
        NonStart sut = new NonStart();
        String result = sut.getPartialString("java", "code");
        Assert.assertEquals("avaode", result);
    }
    @Test
    public void getPartialString_returns_hotlava_from_shotl_java() {
        NonStart sut = new NonStart();
        String result = sut.getPartialString("shotl", "java");
        Assert.assertEquals("hotlava", result);
    }
    @Test
    public void getPartialString_returns_ava_from_s_java() {
        NonStart sut = new NonStart();
        String result = sut.getPartialString("s", "java");
        Assert.assertEquals("ava", result);
    }
    @Test
    public void getPartialString_returns_hotl_from_shotl_j() {
        NonStart sut = new NonStart();
        String result = sut.getPartialString("shotl", "j");
        Assert.assertEquals("hotl", result);
    }
    @Test
    public void getPartialString_returns_hotl_from_shotl_empty_string() {
        NonStart sut = new NonStart();
        String result = sut.getPartialString("shotl", "");
        Assert.assertEquals("hotl", result);
    }
    @Test
    public void getPartialString_returns_ava_from_empty_string_java() {
        NonStart sut = new NonStart();
        String result = sut.getPartialString("", "java");
        Assert.assertEquals("ava", result);
    }



}
