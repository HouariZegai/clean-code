package com.houarizegai.designpatterns.chain;

public class Request {

    private RequestType type;
    private double amount;

    public Request(RequestType type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public RequestType getType() {
        return type;
    }

    public void setType(RequestType type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
