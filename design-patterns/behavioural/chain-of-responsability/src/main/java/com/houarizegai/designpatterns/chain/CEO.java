package com.houarizegai.designpatterns.chain;

public class CEO extends Handler {
    @Override
    public void handleRequest(Request request) {
        System.out.format("CEO handle request of type '%s' and amount %.2f and can handle everything.\n",
                request.getType().name(), request.getAmount());
    }
}
