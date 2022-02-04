package com.houarizegai.designpatterns.chain;

import org.junit.jupiter.api.Test;

public class ChainOfResponsibilityTest {

    @Test
    void testPattern() {
        Director director = new Director();
        VR moh = new VR();
        CEO houari = new CEO();

        director.setSuccessor(moh);
        moh.setSuccessor(houari);

        Request request1 = new Request(RequestType.CONFERENCE, 1000);
        Request request2 = new Request(RequestType.PURCHASE, 800);
        Request request3 = new Request(RequestType.PURCHASE, 1700);

        director.handleRequest(request1);
        director.handleRequest(request2);
        director.handleRequest(request3);
    }
}
