package com.techelevator;

import java.util.Scanner;

public class kmconverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //greet the user and prompt them to enter a start from, end with, and increment value
        System.out.print("Enter a kilometer value to start at: ");
        String value = input.nextLine();
        int kilometerStart = Integer.parseInt(value);

        System.out.print("Enter a kilometer value to end with: ");
        value = input.nextLine();
        int kilometerEnd = Integer.parseInt(value);

        System.out.print("How many should it increment by: ");
        value = input.nextLine();
        int incrementBy = Integer.parseInt(value);

        System.out.println("Going from " + kilometerStart + "km to " + kilometerEnd +
                "km in increments of " + incrementBy + "km.");

        if (kilometerEnd % incrementBy != 0 ) {
            kilometerEnd += incrementBy;
        }

        //print out each value converted into miles from start from to end with
        for (int i = kilometerStart; i <= kilometerEnd ; i += incrementBy) {
            System.out.println(i + "km is " + i * 0.621371 + "mi.");
        }
    }
}
