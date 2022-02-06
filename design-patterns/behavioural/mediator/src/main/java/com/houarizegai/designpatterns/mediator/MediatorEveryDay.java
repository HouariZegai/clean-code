package com.houarizegai.designpatterns.mediator;

import java.util.Timer;
import java.util.TimerTask;

public class MediatorEveryDay {

    private Timer timer;

    public MediatorEveryDay(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds * 1000);
        timer.schedule(new RemindTaskWithoutBeep(), seconds * 1000 * 2);

        sleep(7);
    }

    private void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    class RemindTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("It's the time!");
        }
    }

    class RemindTaskWithoutBeep extends TimerTask {
        @Override
        public void run() {
            System.out.println("Now really time's up!");
            timer.cancel();
        }
    }
}

