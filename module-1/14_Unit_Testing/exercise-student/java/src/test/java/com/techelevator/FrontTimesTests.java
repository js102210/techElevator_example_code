package com.techelevator;
import org.junit.Assert;
import org.junit.Test;
public class FrontTimesTests {

    @Test
    public void generateString_returns_correctly_for_Abc_3() {
        FrontTimes sut = new FrontTimes();
        String result = sut.generateString("Abc", 3);
        Assert.assertEquals("AbcAbcAbc", result);

    }

    @Test
    public void generateString_returns_correctly_for_Abcd_3() {
        FrontTimes sut = new FrontTimes();
        String result = sut.generateString("Abcd", 3);
        Assert.assertEquals("AbcAbcAbc", result);

    }

    @Test
    public void generateString_returns_correctly_for_Ab_3() {
        FrontTimes sut = new FrontTimes();
        String result = sut.generateString("Ab", 3);
        Assert.assertEquals("AbAbAb", result);

    }

    @Test
    public void generateString_returns_correctly_for_Abc_0() {
        FrontTimes sut = new FrontTimes();
        String result = sut.generateString("Abc", 0);
        Assert.assertEquals("", result);

    }
    @Test
    public void generateString_returns_correctly_for_empty_string_3() {
        FrontTimes sut = new FrontTimes();
        String result = sut.generateString("", 3);
        Assert.assertEquals("", result);

    }
    @Test
    public void generateString_returns_correctly_for_empty_null_3() {
        FrontTimes sut = new FrontTimes();
        String result = sut.generateString(null, 3);
        Assert.assertEquals("", result);
        //originally I had this as null instead of "", which caused the unit test to fail. In general, should a method passed null return something empty, or return null?

    }


}
