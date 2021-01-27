package com.techelevator.playingcards;


public class Demo {

    public static void main(String[] args) {

        Card newCard = new Card("Jack", Suit.SPADES);
        newCard.flip();
        System.out.println(newCard.getDescription());

    }
}
