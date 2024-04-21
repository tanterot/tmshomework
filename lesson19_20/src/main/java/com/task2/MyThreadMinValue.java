package com.task2;

import lombok.Getter;

public class MyThreadMinValue implements Runnable {
    @Getter
    private int minValue= Integer.MAX_VALUE;
    private int[] values;

    public MyThreadMinValue(int[] values) {
        this.values = values;
    }

    @Override
    public void run() {
        for (Integer value: values){
            minValue = Math.min(minValue, value);
        }
    }

}
