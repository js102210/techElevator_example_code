package com.techelevator;

import java.math.BigDecimal;

public class CheckingAccount extends BankAccount {

    //instance variables


    //constructors

    public CheckingAccount (String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);

    }

    public CheckingAccount(String accountHolderName, String accountNumber, int balanceInt) {
        super(accountHolderName, accountNumber, balanceInt);

    }



    //other methods


    @Override
    public int withdraw(int intAmountToWithdraw) {
       boolean withDrawFailed = false;
       boolean feesApplied = false;
       //BigDecimal amountToWithdraw = BigDecimal.valueOf(intAmountToWithdraw);

        if (super.getBalance() - intAmountToWithdraw < 0) {
            feesApplied = true;
        }
        if (super.getBalance() - intAmountToWithdraw < - 100) {
            withDrawFailed = true;
        }

        if (!withDrawFailed && feesApplied) {
            super.withdraw(10);
        }

        if (!withDrawFailed){
            super.withdraw(intAmountToWithdraw);
        }
        return super.getBalance();
    }
}
