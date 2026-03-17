package com.ibm.programs.Activity2;

public class BankAccount {

    private Integer balance;

    // constructor
    public BankAccount(Integer initialBalance) {
        balance = initialBalance;
    }

    // withdraw method
    public Integer withdraw(Integer amount) {

        if (balance < amount) {
            throw new NotEnoughFundsException(amount, balance);
        }

        balance -= amount;
        return balance;
    }
}