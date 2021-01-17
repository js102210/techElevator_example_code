package com.techelevator;

import java.util.Scanner;

public class DiscountCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to the discount calculator!");

        //take price of item from user
        System.out.println("Please Enter the normal price: ");
        String value = input.nextLine();
        double normalPrice = Double.parseDouble(value);



        //prompt user to enter discount percentage
        System.out.println("Please Enter Discount Amount ");
        value = input.nextLine();
        double discountAmount = Double.parseDouble(value);


        //calculate the discount and subtract that amount from the original price
        double discountedPrice = normalPrice * (discountAmount / 100.0);
        //print discounted price

        System.out.format("The discounted price is: ",  discountedPrice);



    }
}
