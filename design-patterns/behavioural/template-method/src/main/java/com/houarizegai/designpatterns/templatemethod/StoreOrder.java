package com.houarizegai.designpatterns.templatemethod;

public class StoreOrder extends OrderTemplate {
    @Override
    public void doCheckout() {
        System.out.println("Checkout for store order");
    }

    @Override
    public void doPayment() {
        System.out.println("payment for store order");
    }

    @Override
    public void doReceipt() {
        System.out.println("receipt for store order");
    }

    @Override
    protected void doDelivery() {
        System.out.println("delivery for store order");
    }
}
