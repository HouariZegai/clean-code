package com.houarizegai.designpatterns.strategy;

public class VisaStrategy extends ValidationStrategy {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return creditCard.getCvv().endsWith("7");
    }
}
