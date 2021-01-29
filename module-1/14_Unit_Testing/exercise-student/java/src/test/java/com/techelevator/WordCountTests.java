package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordCountTests {
    @Test
    public void wordCount_ba_ba_black_sheep_returns_ba_2_black_1_sheep_1() {
        WordCount sut = new WordCount();
        boolean mapsMatch;
        Map<String, Integer> result = sut.getCount(new String[]{"ba", "ba", "black", "sheep"});
        Map<String, Integer> desiredOutput = new HashMap<>();
        desiredOutput.put("ba", 2);
        desiredOutput.put("black", 1);
        desiredOutput.put("sheep", 1);
        mapsMatch = desiredOutput.equals(result);
        Assert.assertTrue(mapsMatch);
    }
    @Test
    public void wordCount_a_b_a_c_b_returns_a_2_b_2_c_1() {
        WordCount sut = new WordCount();
        boolean mapsMatch;
        Map<String, Integer> result = sut.getCount(new String[]{"a", "b", "a", "c", "b"});
        Map<String, Integer> desiredOutput = new HashMap<>();
        desiredOutput.put("a", 2);
        desiredOutput.put("b", 2);
        desiredOutput.put("c", 1);
        mapsMatch = desiredOutput.equals(result);
        Assert.assertTrue(mapsMatch);
    }
    @Test
    public void wordCount_empty_array_returns_empty_map() {
        WordCount sut = new WordCount();
        boolean mapsMatch;
        Map<String, Integer> result = sut.getCount(new String[]{});
        Map<String, Integer> desiredOutput = new HashMap<>();

        mapsMatch = desiredOutput.equals(result);
        Assert.assertTrue(mapsMatch);
    }
    @Test
    public void wordCount_c_b_a_returns_c_1_b_1_a_1() {
        WordCount sut = new WordCount();
        boolean mapsMatch;
        Map<String, Integer> result = sut.getCount(new String[]{"c", "b", "a"});
        Map<String, Integer> desiredOutput = new HashMap<>();
        desiredOutput.put("c", 1);
        desiredOutput.put("b", 1);
        desiredOutput.put("a", 1);
        mapsMatch = desiredOutput.equals(result);
        Assert.assertTrue(mapsMatch);
    }
    @Test
    public void wordCount_null_returns_empty_map() {
        WordCount sut = new WordCount();
        boolean mapsMatch;
        Map<String, Integer> result = sut.getCount(null);
        Map<String, Integer> desiredOutput = new HashMap<>();

        mapsMatch = desiredOutput.equals(result);
        Assert.assertTrue(mapsMatch);
    }

}
