package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the Fibonacci number: " );
		String value = input.nextLine();
		int endNum = Integer.parseInt(value);
		int fibStart1 = 0;
		int fibStart2 = 1;
		 while (fibStart1 < endNum) {
			int holderVal;
			System.out.print(fibStart1 + ", ");
			holderVal = fibStart1;
			fibStart1 = fibStart2;
			fibStart2 += holderVal;
		}


	}

}
