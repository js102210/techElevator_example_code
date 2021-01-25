package com.techelevator;

import java.math.BigDecimal;

public class BankAccount {

    //instance variables
    private String accountHolderName;
    private String accountNumber;
    private BigDecimal balance = BigDecimal.ZERO;
    private int balanceInt;

    //getters

    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public int getBalance() { return this.balance.intValue(); }

    //constructors

    public BankAccount (String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        balanceInt = balance.intValue();
    }

    public BankAccount (String accountHolderName, String accountNumber, int balanceInt) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balanceInt = balanceInt;
        this.balance = BigDecimal.valueOf(balanceInt);

    }

    //methods
    public int deposit (int amountToDeposit) {
        this.balanceInt = this.balanceInt + amountToDeposit;
       this.balance = this.balance.add(BigDecimal.valueOf(amountToDeposit));
        return getBalance();
    }

    public int withdraw (int intAmountToWithdraw) {
        BigDecimal amountToWithdraw = BigDecimal.valueOf(intAmountToWithdraw);

        this.balance = this.balance.subtract(amountToWithdraw);
        return this.balance.intValue();
    }

}