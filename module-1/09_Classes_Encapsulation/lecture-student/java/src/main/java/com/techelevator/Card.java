package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Card {


    private final String suit;
    private final String rank;
    private boolean isFaceUp;

    public static String shape = "Rectangle";

    public String getSuit() {
        return suit;
    }
    public String getRank() {
        return rank;
    }

    public boolean isFaceUp(){
        return isFaceUp();
    }

    public String getDescription() {
        String description = "Facedown";
        if (isFaceUp) {
            description = rank + " of " + suit;
        }
        return description;
    }




 /*   public void setSuit(String suit) {
        this.suit = suit;
    }
    public void setRank (String rank) {
        this.rank = rank;
    } */

    public void setFaceUp () {
        this.isFaceUp = isFaceUp();
    }


    public void flip() {
        isFaceUp = !isFaceUp;
    }

    public int getValue() {
        Map<String, Integer> cardValues = new HashMap<>();
        cardValues.put("Two", 2);
        cardValues.put("Three", 3);
        cardValues.put("Four", 4);
        cardValues.put("Five", 5);
        cardValues.put("Six", 6);
        cardValues.put("Seven", 7);
        cardValues.put("Eight", 8);
        cardValues.put("Nine", 9);
        cardValues.put("Ten", 10);
        cardValues.put("Jack", 11);
        cardValues.put("Queen", 12);
        cardValues.put("King", 13);
        cardValues.put("Ace", 14);
        return cardValues.get(rank);
    }

    public Card() {
        rank = "Ace";
        suit = "Spades";

    }

    public Card (String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public boolean isHigherThan (Card otherCard){
        return this.getValue() > otherCard.getValue();
    }
}
