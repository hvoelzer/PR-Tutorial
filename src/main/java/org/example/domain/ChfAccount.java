package org.example.domain;

public class ChfAccount {

    String name;
    Double balance;
    public ChfAccount(String name) {
        this.name = name;
        this.balance = 0.0;
    }

    public void deposit(Amount amount) {
        if (amount.currency() != Currency.CHF) {throw new RuntimeException();}

        this.balance += amount.amount();
//        this.balance = AmountAdder.add(amount,getBalance()).amount();
    }

    public Amount getBalance() {
        return Amount.of(this.balance, Currency.CHF);
    }

    public String toString() {
        return this.name + " has " + this.balance;
    }

}
