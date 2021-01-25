package com.techelevator;

import java.util.List;

public class ReserveAuction extends Auction {
    private final int reservePrice;


   public ReserveAuction (String itemForSale, int reservePrice) {
       super(itemForSale);
       this.reservePrice = reservePrice;
   }

   public int getReservePrice(){
       return this.reservePrice;
   }


   @Override
   public boolean placeBid(Bid offeredBid) {
      boolean isValidBid =  false;
      if( offeredBid.getBidAmount() >= reservePrice) {
           isValidBid = super.placeBid(offeredBid);

       }
      return isValidBid;
   }



}

