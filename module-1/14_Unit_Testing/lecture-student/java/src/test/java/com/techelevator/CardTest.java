package com.techelevator;

import com.techelevator.playingcards.Card;
import com.techelevator.playingcards.Suit;
import org.junit.Assert;
import org.junit.Test;

public class CardTest {
    @Test
    public void no_arg_constructor_makes_ace_of_spades() {
        //arrange
        Card sut = new Card();

        //assert
        Assert.assertEquals("Ace", sut.getRank());
        Assert.assertEquals(Suit.SPADES, sut.getSuit());
    }

    @Test
    public void constructor_makes_specified_card(){
        //arrange
        Card sut = new Card("Jack", Suit.DIAMONDS);
        //assert
        Assert.assertEquals("Jack", sut.getRank());
        Assert.assertEquals(Suit.DIAMONDS, sut.getSuit());
    }

    @Test
    public void getDescription_returns_back_of_card_when_face_down(){
        //Arange
        Card sut = new Card();
        sut.setFaceUp(false);

        //act
        String description = sut.getDescription();

        //assert
        Assert.assertEquals("Back of Card", description);


    }

    public void getDescription_returns_back_of_card_when_face_up() {
        //Arange
        Card sut = new Card();
        sut.setFaceUp(true);

        //act
        String description = sut.getDescription();

        //assert
        Assert.assertEquals("Ace of Spades", description);



    }
    @Test
    public void get_value_for_rank_returns_correctly_for_Seven () {
        //arrange
        //act
        int sut = Card.getValueForRank("Seven");

        //Assert
        Assert.assertEquals(7, sut);

    }


    @Test
    public void isHigherThan_returns_correctly() {
        Card sut = new Card("King", Suit.DIAMONDS);
        Card otherCard = new Card("Ten", Suit.DIAMONDS);
        Assert.assertTrue(sut.isHigherThan(otherCard));
    }

    @Test
    public void getHalfVal_returns_two_and_a_half_for_five() {
        Card sut = new Card("Five", Suit.DIAMONDS);
        double val = sut.getHalfVal();
        Assert.assertEquals(2.5, val, .05);
    }
}
