package com.techelevator;

import java.util.*;

class DigPow {

    public static long digPow(int n, int p) {
        Integer[][] result = new Integer[5][];
        Map<Integer, String> map = new HashMap<>();
        int i = map.size();

        String nString = String.valueOf(n);
        List<Integer> nums = new ArrayList<>();
        while (n%10 != n){
            nums.add(n%10);
            n/=10;
        }
        Integer digit = Integer.parseInt(String.valueOf(nString.charAt(0)));
        nums.add(digit);
        Collections.reverse(nums);
        int total = 0;
        for (int i = 0; i < nums.size(); i++){
            int op = (int)Math.pow(nums.get(i), p);
            total += op;
            p++;
        }
        if (n % total == 0){
            return total/n;
        } else {
            return -1;
        }


    }

    public static void main(String[] args) {
       long result = digPow(92, 1);
       System.out.println(result);
    }

}
