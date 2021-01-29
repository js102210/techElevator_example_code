package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class AnimalGroupNameTests {
    @Test
    public void getHerd_returns_Tower_for_giraffe() {
        //arrange
        AnimalGroupName sut = new AnimalGroupName();
        //act
        String herd = sut.getHerd("rhino");
        //assert
        Assert.assertEquals("Crash", herd);
    }

    @Test
    public void getHerd_returns_unknown_for_input_not_in_map() {
        AnimalGroupName sut = new AnimalGroupName();
        String herd = sut.getHerd("Fenris");
        Assert.assertEquals("unknown", herd);

    }
    @Test
    public void getHerd_returns_unknown_for_input_null() {
        AnimalGroupName sut = new AnimalGroupName();
        String herd = sut.getHerd(null);
        Assert.assertEquals("unknown", herd);

    }
    @Test
    public void getHerd_returns_from_map_with_mixed_case_input() {
        AnimalGroupName sut = new AnimalGroupName();
        String herd = sut.getHerd("cRoCoDiLe");
        Assert.assertEquals("Float", herd);

    }
}
