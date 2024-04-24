package com.task2;

import lombok.Getter;

import java.util.Arrays;

public class MyThreadMinValue implements Runnable {
    @Getter
    private int min;
    private int[] values;

    public MyThreadMinValue(int[] values) {
        this.values = values;
    }

    @Override
    public void run() {
        min = Arrays.stream(values)
                .min()
                .orElse(Integer.MAX_VALUE);

    }
}