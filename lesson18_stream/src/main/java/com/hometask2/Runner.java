package com.hometask2;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        //среднее значение первых 10 чисел
        OptionalDouble average = Stream.iterate(1, val -> val + 1)
                .mapToDouble(val -> val)
                .limit(10)
                .average();
//        System.out.println(average);


        //пропустить 5 чисел и вывести следующие 10 чисел, которые деляться на 3 без остатка
        List<Integer> list = Stream.iterate(1, val -> val + 1)
                .skip(5)
                .filter(val -> val % 3 == 0)
                .limit(10)
                .toList();
//        System.out.println(list);

        //посчитать сумму 20 подряд идущих чисел
        int sum = Stream.iterate(1, val -> val + 1)
                .mapToInt(val -> val)
                .limit(10)
                .sum();
//        System.out.println(sum);


    }
}
