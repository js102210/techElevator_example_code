package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a series of decimal values (separated by spaces): ");

		String numbers = input.nextLine();
		String[] numbersArray = numbers.split(" ");

	/*	for (int i = 0; i < numbersArray.length; i++) {
		Integer numberStringInt = Integer.parseInt(numbersArray[i]);
		System.out.println(numbersArray[i] + " in binary is " + Integer.toBinaryString(numberStringInt));
		}*/

		for (int i = 0; i < numbersArray.length; i++) {
			int inputNum = Integer.parseInt(numbersArray[i]);
			System.out.print(inputNum + " in binary is ");

			int binaryNum[] = new int[40];
			int index = 0;
			while (inputNum > 0) {
				binaryNum[index] = inputNum % 2;
				inputNum = inputNum / 2;
				index ++;
			}
			for(int foo = index - 1; foo >=0; foo-- ) {
				System.out.print(binaryNum[foo]);
			}
			System.out.print(" \n");

		}

	}
}