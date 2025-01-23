package org.example.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ChfAccountTest {

    @Test
    void depositTest() {
        ChfAccount aliceAccount = new ChfAccount("Alice");
        Amount oneHundredCHF = Amount.of(100, Currency.CHF);

        aliceAccount.deposit(oneHundredCHF);
        Amount actualBalance = aliceAccount.getBalance();

        assertEquals(actualBalance, oneHundredCHF);
    }

    @Test
    void currencyMismatchTest() {
        ChfAccount aliceAccount = new ChfAccount("Alice");
        Amount oneHundredUSD = Amount.of(100, Currency.USD);

        assertThrows(Exception.class, () -> {
            aliceAccount.deposit(oneHundredUSD);});

    }


}
