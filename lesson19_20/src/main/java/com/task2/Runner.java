package com.task2;

public class Runner {
    public static void main(String[] args) throws InterruptedException {

        int[] arrays = {1,2,3,4,11,22,33};

        MyThreadMaxValue myThreadMaxValue = new MyThreadMaxValue(arrays);
        MyThreadMinValue myThreadMinValue = new MyThreadMinValue(arrays);
        Thread threadMax = new Thread(myThreadMaxValue);
        Thread threadMin = new Thread(myThreadMinValue);

        threadMax.start();
        threadMin.start();

        threadMin.join();
        threadMax.join();

        System.out.println("min value: " + myThreadMinValue.getMinValue());
        System.out.println("max value: "+ myThreadMaxValue.getMaxValue());


    }
}
