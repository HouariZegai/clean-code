package com.houarizegai.designpatterns.observer;

import org.junit.jupiter.api.Test;

class ObserverTest {

    @Test
    public void testObserver() {
        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(200.0);
        stockGrabber.setApplePrice(600.0);
        stockGrabber.setGooglePrice(300.0);

        StockObserver observer2 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(300.0);
        stockGrabber.setApplePrice(199.0);
        stockGrabber.setGooglePrice(498.0);
    }
}