package com.task1;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()-> System.out.println("hello from thread is runnable"));
        MyThread myThread = new MyThread();

        thread.start();
        myThread.start();

        thread.join();
        myThread.join();


    }
}
