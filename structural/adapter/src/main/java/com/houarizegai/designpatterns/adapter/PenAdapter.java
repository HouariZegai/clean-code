package com.houarizegai.designpatterns.adapter;

public class PenAdapter implements Pen {

    PilotPen pilotPen = new PilotPen();

    @Override
    public void write(String str) {
        pilotPen.mark(str);
    }
}
