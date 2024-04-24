package com.task1;

public class MyThread extends Thread{
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println("hello from is"+ thread.getName());
    }
}
