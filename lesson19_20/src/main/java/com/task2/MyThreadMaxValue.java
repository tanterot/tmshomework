package com.task2;

import lombok.Getter;

public class MyThreadMaxValue implements Runnable {
    @Getter
    private int maxValue = Integer.MIN_VALUE;
    private int[] values;

    public MyThreadMaxValue(int[] values) {
        this.values = values;
    }

    @Override
    public void run() {
        for (Integer value : values){
            maxValue = Math.max(maxValue,value);
        }
    }
}
