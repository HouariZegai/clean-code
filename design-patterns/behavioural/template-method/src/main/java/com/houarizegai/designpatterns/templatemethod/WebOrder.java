package com.houarizegai.designpatterns.templatemethod;

public class WebOrder extends OrderTemplate {
    @Override
    public void doCheckout() {
        System.out.println("Checkout for web order");
    }

    @Override
    public void doPayment() {
        System.out.println("Payment for web order");
    }

    @Override
    public void doReceipt() {
        System.out.println("Receipt for web order");
    }

    @Override
    protected void doDelivery() {
        System.out.println("Delivery for web order");
    }
}
