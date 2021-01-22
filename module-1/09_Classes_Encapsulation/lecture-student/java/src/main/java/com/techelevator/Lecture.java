package com.techelevator;


public class Lecture {

    public static void main(String[] args) {

        Card firstCard = new Card();
        Card secondCard = new Card();




       /* firstCard.setSuit("Clubs");
        secondCard.setSuit("Diamonds");
        secondCard.setRank("Nine");*/


        /*System.out.println(firstCard.getSuit());

        System.out.println(secondCard.getSuit() + " " + secondCard.getRank());
        System.out.println(secondCard.getDescription());
        System.out.println(firstCard.getDescription());
        System.out.println(secondCard.getValue());

        Card thirdCard = new Card("Queen", "Hearts");
        System.out.println(thirdCard.getDescription());
        System.out.println(thirdCard.getValue());
        secondCard.flip();
        System.out.println(secondCard.getDescription());
        secondCard.flip();
        System.out.println(secondCard.getDescription());
        System.out.println(Card.shape);*/

        Deck myDeck = new Deck();
        myDeck.shuffle();
        Card firstPick = myDeck.drawCard();
        firstPick.flip();
        System.out.println(firstPick.getDescription());




        while (myDeck.getCardCount() > 0) {
            Card pick = myDeck.drawCard();
            pick.flip();
            System.out.println(pick.getDescription());

        }




    }
}
