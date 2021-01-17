package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// prompt the user for temp and store value in a string
		System.out.println("Please enter the temperature: ");
		String temperatureVal = input.nextLine();

		//parse string into a double
		Double tempDouble = Double.parseDouble(temperatureVal);
		//prompt the user for C or F and set the isCelsius boolean accordingly
		System.out.println("Is the temperature in (C)elsius, or (Farenheit)? ");
		String tempType = input.nextLine();

		//calculate the other measurement and return a concatenated string with the relevant result
		double otherTempDouble;
		if(tempType.equals("c")) {
			otherTempDouble = tempDouble * 1.8 + 32;
			//int tempInt = tempDouble.intValue();
			//System.out.format(tempInt + tempType + " is " +(int)otherTempDouble + "F");
			System.out.format("%.0fC" + " is " + "%.0fF", tempDouble, otherTempDouble);
		} else {
			otherTempDouble = (tempDouble - 32) / 1.8;
			//int tempInt = tempDouble.intValue();
			//System.out.format(tempInt + tempType + " is " + (int)otherTempDouble + "C");
			System.out.format("%.0fF" + " is " + "%.0fC", tempDouble, otherTempDouble);
		}

	}

}
