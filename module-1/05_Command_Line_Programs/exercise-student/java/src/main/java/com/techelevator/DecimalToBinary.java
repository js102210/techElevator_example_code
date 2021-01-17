package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a series of decimal values (separated by spaces): ");

		String numbers = input.nextLine();
		String[] numbersArray = numbers.split(" ");

		for (int i = 0; i < numbersArray.length; i++) {
		Integer numberStringInt = Integer.parseInt(numbersArray[i]);
		System.out.println(numbersArray[i] + " in binary is " + Integer.toBinaryString(numberStringInt));
		}



	}

}
