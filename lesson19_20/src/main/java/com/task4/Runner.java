package com.task4;

public class Runner {
    public static void main(String[] args) {
        Marker marker = new Marker();
        MyThread1 myThread1 = new MyThread1(marker);
        MyThread2 myThread2 = new MyThread2(marker);

        myThread1.start();
        myThread2.start();

    }
}
