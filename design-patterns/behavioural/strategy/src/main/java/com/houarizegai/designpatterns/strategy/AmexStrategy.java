package com.houarizegai.designpatterns.strategy;

public class AmexStrategy extends ValidationStrategy {

    @Override
    public boolean isValid(CreditCard creditCard) {
        return creditCard.getNumber().startsWith("123");
    }
}
