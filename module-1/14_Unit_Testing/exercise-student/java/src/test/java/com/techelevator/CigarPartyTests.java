package com.techelevator;
import org.junit.Assert;
import org.junit.Test;
public class CigarPartyTests {

    @Test
    public void cigarParty_returns_false_when_below_range_weekend_either(){
        CigarParty sut = new CigarParty();

        boolean firstResult = sut.haveParty(30, false);
        boolean secondResult = sut.haveParty(30, true);

        Assert.assertEquals(false, firstResult);
        Assert.assertEquals(false, secondResult);
        //is it better practice to make the above two separate tests, or is it okay to combine them?
    }

    @Test
    public void cigarParty_returns_true_when_in_range_weekend_false_bottom() {
        CigarParty sut = new CigarParty();
        boolean result = sut.haveParty(40, false);
        Assert.assertEquals(true, result);
    }
    @Test
    public void cigarParty_returns_true_when_in_range_weekend_false_top() {
        CigarParty sut = new CigarParty();
        boolean result = sut.haveParty(60, false);
        Assert.assertEquals(true, result);
    }

    @Test
    public void cigarParty_returns_false_when_above_range_weekend_false() {
        CigarParty sut = new CigarParty();
        boolean result = sut.haveParty(61, false);
        Assert.assertEquals(false, result);
    }

    @Test
    public void cigarParty_returns_true_when_above_range_weekend_true() {
        CigarParty sut = new CigarParty();
        boolean result = sut.haveParty(1437947, true);
        Assert.assertEquals(true, result);
    }








}


