package com.techelevator;

import java.math.BigDecimal;

public class SavingsAccount extends BankAccount{
    //instance variables

    //constructors
    public SavingsAccount (String accountholderName, String accountNumber){
        super(accountholderName, accountNumber);

    }

    public SavingsAccount (String accountholderName, String accountNumber, int balanceInt){
        super(accountholderName, accountNumber, balanceInt);

    }

    //methods

    @Override
    public int withdraw(int intAmountToWithdraw) {
    boolean feesApplied = false;
    boolean withdrawFailed = false;
    //BigDecimal amountToWithdraw = BigDecimal.valueOf(intAmountToWithdraw);

    if (super.getBalance() - intAmountToWithdraw < 150) {
        feesApplied = true;
    }
   if (super.getBalance() - intAmountToWithdraw < 0) {
       withdrawFailed = true;
   }

    if (feesApplied && !withdrawFailed) {
        super.withdraw(2);
    }

    if (!withdrawFailed) {
        super.withdraw(intAmountToWithdraw);
    }

        return super.getBalance();
    }



}
