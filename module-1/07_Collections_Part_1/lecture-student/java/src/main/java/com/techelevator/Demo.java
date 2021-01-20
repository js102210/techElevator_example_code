package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        int num = 5;
        Integer number = 5;

        String s = number.toString();

        num = number; // num still int, ref value of number was unboxed, and assigned to the int value of num

        List<Integer> myList; //at this point myList == null
        myList = new ArrayList<Integer>();

        List<Double> myOtherList = new ArrayList<Double>();

        System.out.println(s);


    }
}
