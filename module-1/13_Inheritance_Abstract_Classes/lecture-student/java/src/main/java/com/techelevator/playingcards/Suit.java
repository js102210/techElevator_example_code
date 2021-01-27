package com.techelevator.playingcards;

import java.util.Locale;

public enum Suit {

    HEARTS, SPADES, CLUBS, DIAMONDS;


    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
