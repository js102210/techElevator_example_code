package com.techelevator;

import java.util.*;

public class Demo {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(10);
        numbers.add(4096);
        numbers.add(10);
        numbers.add(72);
        System.out.println(numbers);

        Set<Integer> moreNumbers = new TreeSet<>();
        moreNumbers.add(12);
        moreNumbers.add(10);
        moreNumbers.add(4096);
        moreNumbers.add(10);
        moreNumbers.add(100);
        System.out.println(moreNumbers);

        for (int number : moreNumbers) {
            System.out.println(number);
        }



    }
}
