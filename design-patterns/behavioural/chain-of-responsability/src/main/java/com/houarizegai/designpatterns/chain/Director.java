package com.houarizegai.designpatterns.chain;

public class Director extends Handler {

    @Override
    public void handleRequest(Request request) {
        if(RequestType.PURCHASE.equals(request.getType()) && request.getAmount() < 1500)
            System.out.format("Request of type '%s' and amount %.2f is handled by the director\n",
                    request.getType().name(), request.getAmount());
        else
            successor.handleRequest(request);
    }
}
