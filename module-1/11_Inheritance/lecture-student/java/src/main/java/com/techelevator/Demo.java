package com.techelevator;

public class Demo {

    public static void main(String[] args) {

        Auction firstAuction = new Auction("virgin soul");
        System.out.println("High bid for this soul is " + firstAuction.getHighBid().getBidAmount());
        firstAuction.placeBid(new Bid("azathoth", 6));
        System.out.println("Current high bidder is " + firstAuction.getHighBid().getBidder() + " and the amount is " + firstAuction.getHighBid().getBidAmount());
        firstAuction.placeBid(new Bid("erebus", 66));
        System.out.println("Current high bidder is " + firstAuction.getHighBid().getBidder() + " and the amount is " + firstAuction.getHighBid().getBidAmount());
        firstAuction.placeBid(new Bid("iblis", 666));
        System.out.println("Current high bidder is " + firstAuction.getHighBid().getBidder() + " and the amount is " + firstAuction.getHighBid().getBidAmount());
        firstAuction.placeBid(new Bid("Stan", 667));
        System.out.println("Current high bidder is " + firstAuction.getHighBid().getBidder() + " and the amount is " + firstAuction.getHighBid().getBidAmount());

        ReserveAuction secondAuction = new ReserveAuction("Storied Soul", 66);
        secondAuction.placeBid(new Bid ("Beatrice", 65));
        System.out.println("Current high bidder is " + secondAuction.getHighBid().getBidder() + " and the amount is " + secondAuction.getHighBid().getBidAmount());
        secondAuction.placeBid(new Bid ("Beatrice", 66));
        System.out.println("Current high bidder is " + secondAuction.getHighBid().getBidder() + " and the amount is " + secondAuction.getHighBid().getBidAmount());

        BuyoutAuction thirdAuction = new BuyoutAuction("Lot of mundane souls (15)", 666);
        thirdAuction.placeBid(new Bid("McConnel", 45));
        System.out.println("Current high bidder is " + thirdAuction.getHighBid().getBidder() + " and the amount is " + thirdAuction.getHighBid().getBidAmount());
        thirdAuction.placeBid(new Bid("Anakin", 666));
        System.out.println("Current high bidder is " + thirdAuction.getHighBid().getBidder() + " and the amount is " + thirdAuction.getHighBid().getBidAmount());
        thirdAuction.placeBid(new Bid("that skin flap monster from Pan's Labyrinth", 670));
        System.out.println("Current high bidder is " + thirdAuction.getHighBid().getBidder() + " and the amount is " + thirdAuction.getHighBid().getBidAmount());
    }
}
