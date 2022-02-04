package com.houarizegai.designpatterns.chain;

public class VR extends Handler {

    @Override
    public void handleRequest(Request request) {
        if(RequestType.CONFERENCE.equals(request.getType()))
            System.out.format("Request of type '%s' and amount %.2f is handled by the VR\n", request.getType().name(),
                    request.getAmount());
        else
            successor.handleRequest(request);
    }
}
