package com.tms.task;

import java.util.function.Consumer;
import java.util.function.Function;
//конвертация валюты первый метод имеет возврощаемое значение Double второй метод void;
public class Converter {
    Function<String ,Double> parseBYNtoUSD = BYN -> Double.parseDouble(BYN) / 3.28;

    Consumer<String> parseConsumerBYNtoUSD = BYN -> System.out.println(Double.parseDouble(BYN) / 3.28);

}
