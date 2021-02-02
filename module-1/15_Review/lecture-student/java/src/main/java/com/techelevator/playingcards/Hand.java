package com.techelevator.playingcards;

public class Hand {
    private int numberOfCards;

    public void addCard(Card card) {
        numberOfCards ++;
    }

    public int getNumberOfCards() {
        return numberOfCards;
    }

    public void addCards(Card[] cards){
        for (Card card : cards){
            this.addCard(card);
        }
    }






}
