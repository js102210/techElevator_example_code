package com.techelevator;

import java.util.*;

public class Lecture {

    //1. removeDuplicates([1,2,1,1,2,1,2]) -> [1,2] or [2,1]
    public List<Integer> removeDuplicates(List<Integer> input) {
        Set<Integer> noDupes = new HashSet<>(input);
        List<Integer> output = new ArrayList<>(noDupes);
        return output;
    }

    //2. musicalGroupNames() -> {2="duo",3="trio",4="quartet"}
    public Map<Integer,String> musicalGroupNames() {
        HashMap grpNames = new HashMap<Integer, String>();
        grpNames.put(2, "duo");
        grpNames.put(3, "trio");
        grpNames.put(4, "quartet");
        return grpNames;
    }

    //3. coinValues() -> {"penny"=1,"nickel"=5,"dime"=10,"quarter"=25}
    public Map<String,Integer> coinValues() {
        HashMap<String, Integer> coinNames = new HashMap<>();
        coinNames.put("penny", 1);
        coinNames.put("nickel", 5);
        coinNames.put("dime", 10);
        coinNames.put("quarter", 25);


        return coinNames;
    }

    //4. describeGroup(3, "violin") -> "violin trio"
    //   describeGroup(0, "trumpet") -> "trumpet group"
    public String describeGroup(int count, String instrument) {
        HashMap grpNames = new HashMap<Integer, String>();
        grpNames.put(2, "duo");
        grpNames.put(3, "trio");
        grpNames.put(4, "quartet");
        String result = "";

        if (grpNames.containsKey(count)) {
            result = result + grpNames.get(count);
        } else {
            result = result + "group";
        }
        return instrument + " " + result;
    }

    //5. totalCents({"nickel","quarter","penny","penny"}) -> 32
    public int totalCents(String[] coins) {
        Map<String, Integer> coinValues = coinValues();
        int totalVal = 0;
        for ( String coin : coins) {
            int value = coinValues.get(coin);
            totalVal += value;
        }

        return totalVal;
    }

    //6. validCoin("dime") -> "valid"
    //   validCoin("token") -> "invalid"
    public String validCoin(String coin) {
        Map<String, Integer> coinValues = coinValues();
        boolean result = false;
        if (coinValues.containsKey(coin)) {
            result = true;
        }
        if (result) {
            return "valid";
        }
        return "invalid";
    }

    //7. stateNames({"Ohio"="Columbus","Kentucky"="Frankfort","Indiana"="Indianapolis"})
    //             -> ["Ohio","Kentucky","Indianapolis"]
    public List<String> stateNames(Map<String,String> capitals) {
        Set<String> stateSet = capitals.keySet();
        List<String> result = new ArrayList<>(stateSet);

        return result;
    }

    //8. availableColors({"red"=true,"blue"=false,"green"=true,"yellow"=true,"gray"=false})
    //                  -> ["red","green","yellow"]
    public List<String> availableColors(Map<String,Boolean> availability) {
        List<String> availColors = new ArrayList<>();

        for (Map.Entry<String,Boolean> entry : availability.entrySet()) {
            if (entry.getValue() == true) {
            availColors.add((entry.getKey()));
            }
        }

        return availColors;
    }

    //9. addBonus({"Player 1"=5000,"Player 2"=2500,"Player 3"=4500}, 500)
    //         -> {"Player 1"=5500,"Player 2"=3000,"Player 3"=5000}
    public void addBonus(Map<String,Integer> scores, int bonus) {

        for (Map.Entry<String, Integer> entry:  scores.entrySet() ) {
            //String playerName = entry.getKey();
            int score = entry.getValue();
            score += bonus;
            entry.setValue(score);
        }

    }

    //10. Modify and return the given map as follows: for this problem the map may or may not contain the
    //    "a" and "b" keys. If both keys are present, append their 2 string values together and store the
    //    result under the key "ab".
    //    mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
    //    mapAB({"a": "Hi"}) → {"a": "Hi"}
    //    mapAB({"b": "There"}) → {"b": "There"}

    public Map<String, String> mapAB(Map<String,String> input) {
        if( input.containsKey("a") && input.containsKey("b")) {
            String aVal = input.get("a");
            String bVal = input.get("b");

            input.put("ab", aVal + bVal);
        }
        return input;
    }

}
