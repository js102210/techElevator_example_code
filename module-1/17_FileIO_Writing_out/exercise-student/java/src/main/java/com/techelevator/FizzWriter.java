package com.techelevator;

import java.io.IOException;
import java.io.PrintWriter;

public class FizzWriter {

	public static void main(String[] args) {
		int[] initialInts = new int[300]; //initialize new array, length 300
		int initNum = 1;
		int index = 0;
		for (int i : initialInts) { //populate array with sequential ints 1-300
			initialInts[index] = initNum;
			initNum++;
			index++;
		}
		try (PrintWriter fileWriter = new PrintWriter("src/test/resources/fizzbuzz.txt")){ //create a new file in desired directory to print array elements to
			int i = 0;
			while (i < initialInts.length){
				int fizznum = initialInts[i];    //loop through array, applying "FizzBuzz" rules to each element
				String lineToPrint;
				if (fizznum % 3 == 0 && fizznum % 5 == 0) {
					lineToPrint = "FizzBuzz";
				} else if (fizznum % 3 == 0 || Integer.toString(fizznum).contains("3") ){
					lineToPrint = "Fizz";
				} else if (fizznum % 5 == 0 || Integer.toString(fizznum).contains("5") ) {
					lineToPrint = "Buzz";
				} else {
					lineToPrint = Integer.toString(fizznum);
				}

				fileWriter.println(lineToPrint);
				i++;
			}
		} catch (IOException e) {
			System.out.println("The file could not be created.");
		}

	}

}
