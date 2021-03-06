package com.techelevator;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {

        double d1 = 0.1;
        double d2 = 0.2;
        System.out.println(d1 + d2);

        BigDecimal b1 = new BigDecimal("0.1");
        BigDecimal b2 = new BigDecimal("0.2");
        System.out.println(b1.add(b2));

        BigDecimal number = new BigDecimal("2.56");

        BigDecimal otherNumber = BigDecimal.ZERO;

       BigDecimal bd2 = BigDecimal.valueOf(d1);
        System.out.println(bd2);

        if (b2.compareTo(b1) > 0){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
