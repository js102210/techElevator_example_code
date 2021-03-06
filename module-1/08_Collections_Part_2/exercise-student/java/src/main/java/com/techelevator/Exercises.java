package com.techelevator;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Exercises {

    /*
     * Given the name of an animal, return the name of a group of that animal
     * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").
     *
     * The animal name should be case insensitive so "elephant", "Elephant", and
     * "ELEPHANT" should all return "herd".
     *
     * If the name of the animal is not found, null, or empty, return "unknown".
     *
     * Rhino -> Crash
     * Giraffe -> Tower
     * Elephant -> Herd
     * Lion -> Pride
     * Crow -> Murder
     * Pigeon -> Kit
     * Flamingo -> Pat
     * Deer -> Herd
     * Dog -> Pack
     * Crocodile -> Float
     *
     * animalGroupName("giraffe") → "Tower"
     * animalGroupName("") -> "unknown"
     * animalGroupName("walrus") -> "unknown"
     * animalGroupName("Rhino") -> "Crash"
     * animalGroupName("rhino") -> "Crash"
     * animalGroupName("elephants") -> "unknown"
     *
     */
    public String animalGroupName(String animalName) {
        Map<String, String> herdNames = new HashMap<>();
        herdNames.put("rhino", "Crash");
        herdNames.put("giraffe", "Tower");
        herdNames.put("elephant", "Herd");
        herdNames.put("lion", "Pride");
        herdNames.put("crow", "Murder");
        herdNames.put("pigeon", "Kit");
        herdNames.put("flamingo", "Pat");
        herdNames.put("deer", "Herd");
        herdNames.put("dog", "Pack");
        herdNames.put("crocodile", "Float");
        boolean isNotNull = false;
        String input = "";
        if (animalName != null) {
            isNotNull = true;
            input = animalName.toLowerCase();
        }
        String result = "";
        if (isNotNull && herdNames.containsKey(input)) {
            result = herdNames.get(input);
        } else {
            result = "unknown";
        }
        return result;
    }

    /*
     * Given an String item number (a.k.a. SKU), return the discount percentage if the item is on sale.
     * If the item is not on sale, return 0.00.
     *
     * If the item number is empty or null, return 0.00.
     *
     * "KITCHEN4001" -> 0.20
     * "GARAGE1070" -> 0.15
     * "LIVINGROOM"	-> 0.10
     * "KITCHEN6073" -> 0.40
     * "BEDROOM3434" -> 0.60
     * "BATH0073" -> 0.15
     *
     * The item number should be case insensitive so "kitchen4001", "Kitchen4001", and "KITCHEN4001"
     * should all return 0.20.
     *
     * isItOnSale("kitchen4001") → 0.20
     * isItOnSale("") → 0.00
     * isItOnSale("GARAGE1070") → 0.15
     * isItOnSale("dungeon9999") → 0.00
     *
     */
    public double isItOnSale(String itemNumber) {
        Map<String, Double> itemsOnSale = new HashMap<>();
        itemsOnSale.put("KITCHEN4001", 0.20);
        itemsOnSale.put("GARAGE1070", 0.15);
        itemsOnSale.put("LIVINGROOM", 0.10);
        itemsOnSale.put("KITCHEN6073", 0.40);
        itemsOnSale.put("BEDROOM3434", 0.60);
        itemsOnSale.put("BATH0073", 0.15);
        String input = "";
        Double result = 0.0;
        if (itemNumber != null) {
            input = itemNumber.toUpperCase();
            if (itemsOnSale.containsKey(input)) {
                result = itemsOnSale.get(input);
            }
        }
        return result;
    }

    /*
     * Modify and return the given Map as follows: if "Peter" has more than 0 money, transfer half of it to "Paul",
     * but only if Paul has less than $10s.
     *
     * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
     *
     * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
     * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
     *
     */
    public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
        if (peterPaul.get("Peter") > 0 && (peterPaul.get("Paul") < 1000)) {
            int amtToTransfer = peterPaul.get("Peter") / 2;
            peterPaul.put("Peter", peterPaul.get("Peter") - amtToTransfer);
            peterPaul.put("Paul", peterPaul.get("Paul") + amtToTransfer);

        }


        return peterPaul;
    }

    /*
     * Modify and return the given Map as follows: if "Peter" has $50 or more, AND "Paul" has $100 or more,
     * then create a new "PeterPaulPartnership" worth a combined contribution of a quarter of each partner's
     * current worth.
     *
     * peterPaulPartnership({"Peter": 50000, "Paul": 100000}) → {"Peter": 37500, "Paul": 75000, "PeterPaulPartnership": 37500}
     * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333, "Paul": 1234567890}
     *
     */
    public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
        if (peterPaul.get("Peter") >= 5000 && peterPaul.get("Paul") >= 10000) {
            double peterDouble = peterPaul.get("Peter");
            double paulDouble = peterPaul.get("Paul");
            double peterContribution = peterDouble * 0.25;
            double paulContribution = paulDouble * 0.25;
            double partnershipDouble = peterContribution + paulContribution;
            peterDouble = peterDouble - peterContribution;
            paulDouble = paulDouble - paulContribution;
            Integer peterInt = (int) peterDouble;
            Integer paulInt = (int) paulDouble;
            Integer partnershipInt = (int) partnershipDouble;
            peterPaul.put("Peter", peterInt);
            peterPaul.put("Paul", paulInt);
            peterPaul.put("PeterPaulPartnership", partnershipInt);

        }
        return peterPaul;
    }

    /*
     * Given an array of non-empty Strings, return a Map<String, String> where for every different String in the array,
     * there is a key of its first character with the value of its last character.
     *
     * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
     * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
     * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"}
     */
    public Map<String, String> beginningAndEnding(String[] words) {
        HashMap<String, String> firstAndLast = new HashMap<>();
        for (String val : words) {
            String firstChar = val.substring(0, 1);
            String lastChar = val.substring(val.length() - 1);
            firstAndLast.put(firstChar, lastChar);
        }


        return firstAndLast;
    }

    /*
     * Given an array of Strings, return a Map<String, Integer> with a key for each different String, with the value the
     * number of times that String appears in the array.
     *
     * ** A CLASSIC **
     *
     * wordCount(["ba", "ba", "black", "sheep"]) → {"ba" : 2, "black": 1, "sheep": 1 }
     * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
     * wordCount([]) → {}
     * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
     *
     */
    public Map<String, Integer> wordCount(String[] words) {
        HashMap<String, Integer> countedWords = new HashMap<>();
        if (words.length > 0) {
            for (String val : words) {
                int countOfString = 0;
                String valToCheckFor = val;
                for (String val2 : words) {
                    if (val2.contains(valToCheckFor)) {
                        countOfString++;
                    }
                }
                countedWords.put(val, countOfString);
            }
        }
        return countedWords;
    }

    /*
     * Given an array of int values, return a Map<Integer, Integer> with a key for each int, with the value the
     * number of times that int appears in the array.
     *
     * ** The lesser known cousin of the the classic wordCount **
     *
     * intCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 2, 44: 1, 55: 1, 63: 3, 77: 1, 99:2}
     * intCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
     * intCount([]) → {}
     *
     */
    public Map<Integer, Integer> integerCount(int[] ints) {
        HashMap<Integer, Integer> countedInts = new HashMap<>();
        if (ints.length > 0) {

            for (int i : ints) {
                int intToCheckFor = i;
                int countOfInt = 0;
                for (Integer i2 : ints) {
                    if (i2.equals(i)) {
                        countOfInt++;
                    }
                }
                countedInts.put(i, countOfInt);
            }
        }
        return countedInts;
    }

    /*
     * Given an array of Strings, return a Map<String, Boolean> where each different String is a key and value
     * is true only if that String appears 2 or more times in the array.
     *
     * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
     * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
     * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
     *
     */
    public Map<String, Boolean> wordMultiple(String[] words) {
        HashMap<String, Boolean> wordDupes = new HashMap<>();
        if (words.length > 0) {
            for (String val : words) {
                boolean isDupe = false;
                int countOfInt = 0;
                for (String val2 : words) {
                    if (val2.equals(val)) {
                        countOfInt++;
                        if (countOfInt > 1) {
                            isDupe = true;
                            break;
                        }

                    }
                }
                wordDupes.put(val, isDupe);
            }
        }
        return wordDupes;
    }

    /*
     * Given two Maps, Map<String, Integer>, merge the two into a new Map, Map<String, Integer> where keys in Map2,
     * and their int values, are added to the int values of matching keys in Map1. Return the new Map.
     *
     * Unmatched keys and their int values in Map2 are simply added to Map1.
     *
     * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11, "SKU4": 5})
     * 	 → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
     *
     */
    public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse,
                                                     Map<String, Integer> remoteWarehouse) {

        for (Map.Entry<String, Integer> entry : remoteWarehouse.entrySet()) {


            if (mainWarehouse.containsKey(entry.getKey())) {
                Integer newValue = mainWarehouse.get(entry.getKey()) + remoteWarehouse.get(entry.getKey());
                mainWarehouse.put(entry.getKey(), newValue);
            } else {
                mainWarehouse.put(entry.getKey(), entry.getValue());
            }

        }
        return mainWarehouse;
    }

    /*
     * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
     *
     * Given an array of Strings, for each String, the count of the number of times that a subString length 2 appears
     * in the String and also as the last 2 chars of the String, so "hixxxhi" yields 1.
     *
     * We don't count the end subString, but the subString may overlap a prior position by one.  For instance, "xxxx"
     * has a count of 2, one pair at position 0, and the second at position 1. The third pair at position 2 is the
     * end subString, which we don't count.
     *
     * Return Map<String, Integer>, where the key is String from the array, and its last2 count.
     *
     * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
     *
     */
    public Map<String, Integer> last2Revisited(String[] words) {
        HashMap<String, Integer> last2Hash = new HashMap<>();

        for (String val : words) {
            if( val.length() <= 2) {
                last2Hash.put(val, 0);
            } else {
                String last2 = val.substring(val.length() - 2);
                int count = 0;
                for (int i = 0; i < val.length() - 1; i++) {
                    if (val.charAt(i) == last2.charAt(0) && val.charAt(i + 1) == last2.charAt(1)) {
                        count++;
                    }
                } last2Hash.put(val, count - 1);
            }
        }
        return last2Hash;
    }

}


