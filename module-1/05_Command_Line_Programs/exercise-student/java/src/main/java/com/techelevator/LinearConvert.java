package com.techelevator;

import java.util.Scanner;

public class LinearConvert {
	//converts m to f or f to m based on boolean and store the value in otherLengthDouble
	public static double converter(double lengthDouble, boolean isM) {
		double otherLengthDouble;
		if (isM) {
			otherLengthDouble = lengthDouble * 3.2808399;
		} else {
			otherLengthDouble = lengthDouble * 0.3048;
		}
		return otherLengthDouble;
	}
	public static void main(String[] args) {
		boolean isM;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the length: ");
		String value = input.nextLine();
		Double lengthDouble = Double.parseDouble(value);
		System.out.println("Is the measurement in (m)eter, or (f)eet? ");
		String lengthType = input.nextLine();

		if (lengthType.equals("m")) {
			isM = true;
		} else {
			isM = false;
		}
		String otherLengthType;
		if (lengthType.equals("m")) {
			otherLengthType = "f";
		} else {
			otherLengthType = "m";
		}

		//invoke converter method and convert both doubles to ints

		double otherlengthDouble = converter(lengthDouble, isM);
		//int lengthInt = lengthDouble.intValue();

		//print formatted string
		//System.out.format(lengthInt + lengthType + " is " + (int)otherlengthDouble + otherLengthType );
		System.out.format("%.0f" + lengthType + " is " + "%.0f" + otherLengthType, lengthDouble, otherlengthDouble);

	}

}
