package com.houarizegai.designpatterns.templatemethod;

public class TemplateDemo {

    public static void main(String[] args) {
        System.out.println("\nWeb order:");
        OrderTemplate webOrder = new WebOrder();
        webOrder.processOrder();

        System.out.println("\nStore order:");
        OrderTemplate storeOrder = new StoreOrder();
        storeOrder.isGift = true;
        storeOrder.processOrder();
    }
}
