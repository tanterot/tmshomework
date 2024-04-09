package com.tms.task.method;

import com.tms.task.util.Constant;

import java.util.function.Consumer;
import java.util.function.Function;

/*
конвертация валюты первый метод имеет возврощаемое значение Double второй метод void;
static так как нет полей класса и есть только методы
 */
public class Converter {

    public static Function<String, Double> parseBYNtoUSD = byn -> {
        String[] s = byn.split(" ");
        return Double.parseDouble(s[0]) / Constant.USD;
    };

    public static Consumer<String> parseConsumerBYNtoUSD = byn -> {
        String[] s = byn.split(" ");
        System.out.println(Double.parseDouble(s[0]) / Constant.USD);
    };

}
