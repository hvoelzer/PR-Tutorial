package org.example.domain;

public class AmountAdder {

    public static Amount add(Amount a1, Amount a2) {
        assert a1.currency() == a2.currency();
//        Amount result = new Amount(a1.amount() + a2.amount(), a1.currency());
        Amount result = null;
        return result;
    }
}
