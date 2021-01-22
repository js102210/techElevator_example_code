package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    public static final String[] ALL_SUITS = {"Spades", "Diamonds", "Hearts", "Clubs"};
   public static final String[] ALL_RANKS = {"Ace", "Two", "Three", "Four", "Five",
            "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    List<Card> allCards = new ArrayList<>();

    public Deck () {
        for(String suit : ALL_SUITS) {
            for (String rank : ALL_RANKS) {
                Card card = new Card(rank, suit);
                allCards.add(card);
            }
        }
    }
    public Card drawCard() {
        Card drawnCard = allCards.remove(0);
        return drawnCard;
    }

    public int getCardCount() {
        return allCards.size();
    }
    public void shuffle() {
        Collections.shuffle(allCards);
    }

}
