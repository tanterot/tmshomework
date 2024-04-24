package com.task2;

import lombok.Getter;

import java.util.Arrays;

public class MyThreadMaxValue implements Runnable {
    @Getter
    private int max;
    private int[] values;

    public MyThreadMaxValue(int[] values) {
        this.values = values;
    }

    @Override
    public void run() {
        max = Arrays.stream(values)
                .max()
                .orElse(Integer.MIN_VALUE);

    }
}
