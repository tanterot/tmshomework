package com.task4;

public class MyThread1 extends Thread {
    public Marker marker;

    public MyThread1(Marker marker) {
        this.marker = marker;
    }

    @Override
    public void run() {
        synchronized (marker) {
            while (true) {
                System.out.println("1");
                System.out.println("1");
                System.out.println("1");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
