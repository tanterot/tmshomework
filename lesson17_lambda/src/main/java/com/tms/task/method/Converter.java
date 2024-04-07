package com.tms.task.method;

import com.tms.task.util.Constant;

import java.util.function.Consumer;
import java.util.function.Function;
/*
конвертация валюты первый метод имеет возврощаемое значение Double второй метод void;
static так как нет полей класса и есть только методы
 */
public class Converter {

    //хочеться добавить проверку на null , но код не очень будет похож на функцию
    //if(BYN==null){return null}
    public static Function<String, Double> parseBYNtoUSD = BYN ->
            Double.parseDouble(BYN) / Constant.USD;


    //if(BYN != null)
    public static Consumer<String> parseConsumerBYNtoUSD = BYN ->
            System.out.println(Double.parseDouble(BYN) / Constant.USD);

}
