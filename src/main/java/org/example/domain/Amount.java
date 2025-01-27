package org.example.domain;

public record Amount(long amountInCents, Currency currency) {

    public Amount {
        if (currency == null) {throw new IllegalArgumentException("Currency cannot be null");}
    }

    public static Amount of(double amount, Currency currency) {
        return ofCents(Math.round(amount * 100), currency);
    }

    public static Amount ofCents(long amountInCents, Currency currency) {
        return new Amount(amountInCents, currency);
    }

    public double amount() {
        return amountInCents / 100d;
    }
//    public long amount() {return amountInCents; }

    @Override
    public String toString() {
        return currency() + " " + amount();
    }

}


