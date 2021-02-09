package com.techelevator;

import java.util.Scanner;

public class Gftests {
    public static void main(String[] args) {
        boolean running = true;
        String message;
        Scanner input = new Scanner(System.in);
        while (running){
            message = input.nextLine();
            if( !message.equals("quit")) {
                System.out.println(message);
            } else {
                running = false;
            }
        }
    }
}
