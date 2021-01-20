package com.techelevator;

import javax.management.ListenerNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lecture {

	//1. returnsAnArray(5) -> {1, 2, 3, 4, 5}
	public int[] returnsAnArray(int number) {
		int[] intArray = new int[number];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i + 1;
		}
		return intArray;
	}

	//2. returnsAList(5) -> [1, 2, 3, 4, 5]
	public List<Integer> returnsAList(int number) {
	List<Integer> intList = new ArrayList<>() ;
	for (int i = 0; i < number; i++) {
		intList.add(i + 1);

	}
		return intList;
	}

	//3. returnThirdName(["Frodo","Sam","Merry","Pippin"]) -> "Merry"
	public String returnThirdName(List<String> names) {

		return names.get(2);
	}

	//4. insertAfterFirst(["Luke","Leia"], "Han") -> ["Luke", "Han", "Leia"]
	public List<String> insertAfterFirst(List<String> names, String name) {
		List<String> result = new ArrayList<>(names);
		result.add(1, name);
		return result;
	}

	//5. onlyOneAnswer(["yes", "no", "maybe"]) -> false
	//   onlyOneAnswer(["no"]) -> true
	public boolean onlyOneAnswer(List<String> answers) {
		if (answers.size() == 1) {
			return true;
		}
		return false;
	}

	//6. removeLastNumber([1.5, 2.2, 0.9]) -> [1.5, 2.2]
	public List<Double> removeLastNumber(List<Double> numbers) {
		numbers.remove(numbers.size() - 1);
		return numbers;
	}

	//7. hasACow(["duck","cow","chicken"]) -> true
	//   hasACow(["turkey", "rooster"]) -> false
	public boolean hasACow(List<String> farmAnimals) {
		if (farmAnimals.contains("cow")) {
			return true;
		} else {
			return false;
		}
	}

	//8. yourPlaceInLine(["customer","customer","you","customer"]) -> 3
	public int yourPlaceInLine(List<String> allCustomers) {
		int yourPlace = allCustomers.indexOf("you");
		return yourPlace + 1;
	}

	//9. trimArray({"a","b","c","d"}) -> {"b","c"}
	public String[] trimArray(String[] input) {
		List<String> copy = new ArrayList<>(Arrays.asList(input));
		copy.remove(0);
		copy.remove(copy.size() -1);
		String[] result = copy.toArray(new String[0]);

		return result;
	}

	//10. descendingOrder([3, 4, 2, 9, 4, 8]) -> [9, 8, 4, 4, 3, 2]
	public List<Integer> descendingOrder(List<Integer> numbers) {
		List<Integer> sortedList = new ArrayList<>(numbers);
		Collections.sort(sortedList);
		Collections.reverse(sortedList);
		return sortedList;
	}

	//11. countTrues([false,true,true,false,true]) -> 3
	public int countTrues(List<Boolean> answers) {
		int countOfTrues = 0;
		for (Boolean i : answers ) {
			if (i == true) {
				countOfTrues ++;
			}
		}
		return countOfTrues;
	}

	//12. incrementAll([100, 17, 33]) -> [101, 18, 34]
	public List<Integer> incrementAll(List<Integer> numbers) {
		List<Integer> incrementedList = new ArrayList<>();
		for (int i : numbers){
			incrementedList.add(i + 1);
		}
		return incrementedList;
	}

	//13. echo(["Tech","Elevator"]) -> ["Tech","Tech","Elevator","Elevator"]
	public List<String> echo(List<String> words) {
		List<String> echoString = new ArrayList<>();
		for (String val : words) {
			echoString.add(val);
			echoString.add(val);
		}
		return echoString;
	}

}
