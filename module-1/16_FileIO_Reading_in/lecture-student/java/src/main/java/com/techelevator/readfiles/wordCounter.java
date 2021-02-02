package com.techelevator.readfiles;

public class wordCounter {
    public int countWordsInLine(String line) {
        String[] words = line.split(" +");

        return words.length;
    }
}
