package com.techelevator;
import org.junit.Assert;
import org.junit.Test;
public class DateFashionTests {

    @Test
    public void getATable_returns_0_when_you_2_date_8 () {
        DateFashion sut = new DateFashion();
        int result= sut.getATable(2, 8);
        Assert.assertEquals(0, result);
    }
    @Test
    public void getATable_returns_0_when_you_8_date_2 () {
        DateFashion sut = new DateFashion();
        int result= sut.getATable(8, 2);
        Assert.assertEquals(0, result);
    }
    @Test
    public void getATable_returns_0_when_you_7_date_2 () {
        DateFashion sut = new DateFashion();
        int result= sut.getATable(7, 2);
        Assert.assertEquals(0, result);
    }
    @Test
    public void getATable_returns_0_when_you_2_date_2 () {
        DateFashion sut = new DateFashion();
        int result= sut.getATable(2, 2);
        Assert.assertEquals(0, result);
    }
    @Test
    public void getATable_returns_1_when_you_3_date_3 () {
        DateFashion sut = new DateFashion();
        int result= sut.getATable(3, 3);
        Assert.assertEquals(1, result);
    }
    @Test
    public void getATable_returns_1_when_you_7_date_7 () {
        DateFashion sut = new DateFashion();
        int result= sut.getATable(7, 7);
        Assert.assertEquals(1, result);
    }
    @Test
    public void getATable_returns_2_when_you_8_date_7 () {
        DateFashion sut = new DateFashion();
        int result= sut.getATable(8, 7);
        Assert.assertEquals(2, result);
    }
    @Test
    public void getATable_returns_2_when_you_3_date_8 () {
        DateFashion sut = new DateFashion();
        int result= sut.getATable(3, 8);
        Assert.assertEquals(2, result);
    }

    @Test
    public void getATable_returns_0_when_you_0_date_11 () {
        DateFashion sut = new DateFashion();
        int result= sut.getATable(0, 11);
        Assert.assertEquals(0, result);
    }
    @Test
    public void getATable_returns_2_when_you_3_date_1431 () {
        DateFashion sut = new DateFashion();
        int result= sut.getATable(3, 1431);
        Assert.assertEquals(2, result);
    }

}
