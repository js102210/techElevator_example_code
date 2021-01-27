package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
    //instance variables
    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts;

    //getters

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public Accountable[] getAccounts() {
        //Accountable[] accountArray = new Accountable[accounts.size()];
   // accountArray = accounts.toArray(accountArray);
        Accountable [] accountArray = accounts.toArray(new Accountable[accounts.size()]);


        return accountArray;
    }

    //setters


    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    //constructors

    public BankCustomer() {
        this.accounts = new ArrayList<Accountable>();

    }

    //other methods

    public void addAccount(Accountable newAccount) {
        this.accounts.add(newAccount);
    }

    public boolean isVip() {
        int combinedBalance = 0;
        for (Accountable account : accounts) {
            combinedBalance += account.getBalance();
        }
        if (combinedBalance >= 25000) {
            return true;
        } else {
            return false;
        }

    }


}
