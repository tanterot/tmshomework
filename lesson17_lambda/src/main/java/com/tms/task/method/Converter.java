package com.tms.task.method;

import java.util.function.Consumer;
import java.util.function.Function;

//конвертация валюты первый метод имеет возврощаемое значение Double второй метод void;
public class Converter {
    Double USD = 3.28;
    //хочеться добавить проверку на null , но код не очень будет похож на функцию
    //if(BYN==null){return null}
    public Function<String, Double> parseBYNtoUSD = BYN -> Double.parseDouble(BYN) / USD;


    //if(BYN != null)
    public Consumer<String> parseConsumerBYNtoUSD = BYN -> System.out.println(Double.parseDouble(BYN) / USD);

}
