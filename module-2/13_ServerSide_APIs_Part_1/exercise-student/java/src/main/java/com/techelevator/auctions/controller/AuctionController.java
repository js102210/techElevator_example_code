package com.techelevator.auctions.controller;

import com.techelevator.auctions.DAO.AuctionDAO;
import com.techelevator.auctions.DAO.MemoryAuctionDAO;
import com.techelevator.auctions.model.Auction;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private AuctionDAO dao;

    public AuctionController() {
        this.dao = new MemoryAuctionDAO();
    }


    @RequestMapping( method = RequestMethod.GET)
    public List<Auction> listAllAuctions(@RequestParam(defaultValue = "") String title_like, @RequestParam(defaultValue = "0") double currentBid_lte){
      /*  if (title_like.equals("")) {
            return dao.list();
        } else {
            return dao.searchByTitle(title_like);
        } */

      /*  if (currentBid_lte > 0){
            return dao.searchByPrice(currentBid_lte);
        } else {
            return dao.list();
        } */
        List<Auction> result = new ArrayList<>();
        if (title_like.equals("") && currentBid_lte == 0){
            result = dao.list();
        } else if (title_like.equals("")) {
            result = dao.searchByPrice(currentBid_lte);
        }else if (currentBid_lte == 0){
            result = dao.searchByTitle(title_like);
        } else {
           result = dao.searchByTitleAndPrice(title_like, currentBid_lte);
        }
        return result;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Auction getAuctionById(@PathVariable int id){
        return dao.get(id);
    }

    @RequestMapping( method = RequestMethod.POST)
    public Auction postNewAuction(@RequestBody Auction auction){
        return dao.create(auction);
    }

 /*   @RequestMapping(path = "/", method = RequestMethod.GET)
    public List<Auction> searchForAuctionsWithTitle(@RequestParam(required = false) String searchTerm) {
        if (searchTerm.equals("")){
            return dao.list();
        } else {
            return dao.searchByTitle(searchTerm);
        }
    } */




}
