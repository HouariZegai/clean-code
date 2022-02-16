package com.houarizegai.designpatterns.strategy;

public class StrategyDemo {

    public static void main(String[] args) {
        CreditCard amexCard = new CreditCard(new AmexStrategy());
        amexCard.setNumber("123399999999999");
        amexCard.setDate("02/2022");
        amexCard.setCvv("123");

        System.out.println("Is amex valid: " + amexCard.isValid());

        CreditCard card2 = new CreditCard(new AmexStrategy());
        card2.setNumber("00000000000000001");
        card2.setDate("02/2022");
        card2.setCvv("123");

        System.out.println("Is card2 valid: " + card2.isValid());

        CreditCard card3 = new CreditCard(new VisaStrategy());
        card3.setNumber("00000000000000001");
        card3.setDate("02/2022");
        card3.setCvv("127");

        System.out.println("Is card3 valid: " + card3.isValid());
    }
}
