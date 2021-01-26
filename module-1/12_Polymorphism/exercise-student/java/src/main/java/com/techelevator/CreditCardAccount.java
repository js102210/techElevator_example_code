package com.techelevator;

public class CreditCardAccount implements Accountable {

    //instance variables
    private int debt = 0;
    private String accountHolderName;
    private String accountNumber;

    //getters
    public int getDebt() {
        return this.debt;
    }

    public String getAccountHolder() {
        return this.accountHolderName;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    @Override
    public int getBalance() {
        return (this.debt * -1);
    }


    //setters

    //constructors
    public CreditCardAccount(String accountHolder, String accountNumber) {
        this.accountHolderName = accountHolder;
        this.accountNumber = accountNumber;


    }

    //other methods

    public int pay(int amountToPay) {
        this.debt -= amountToPay;

        return this.debt;
    }

    public int charge(int amountToCharge) {
        this.debt += amountToCharge;

        return this.debt;
    }

}
