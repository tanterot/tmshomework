package com.task4;

public class MyThread2 extends Thread{
    Marker marker;

    public MyThread2(Marker marker) {
        this.marker = marker;
    }

    @Override
    public void run() {
        while (true){
            System.out.println("2");
            System.out.println("2");
            System.out.println("2");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
