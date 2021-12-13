package com.houarizegai.designpatterns.observer;

public class StockObserver implements Observer {

    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    private static int observerIdTracker = 0;

    private int observerId;

    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerId = ++observerIdTracker;

        System.out.println("New Observer " + this.observerId);

        this.stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double applePrice, double googlePrice) {
        this.ibmPrice = ibmPrice;
        this.applePrice = applePrice;
        this.googlePrice = googlePrice;

        printThePrices();
    }

    public void printThePrices() {
        System.out.println(observerId + "\nIBM: " + ibmPrice + "\nApple: " + applePrice + "\nGoogle: " + googlePrice);
    }
}
