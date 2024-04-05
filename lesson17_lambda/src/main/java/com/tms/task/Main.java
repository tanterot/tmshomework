package com.tms.task;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
//------------------------------------------------------------------------- task1
        Converter converter = new Converter();

        Double apply = converter.parseBYNtoUSD.apply("615");
        System.out.println(apply);
//------------------------------------------------------------------------- task2
        converter.parseConsumerBYNtoUSD.accept("1000");
//------------------------------------------------------------------------- task3
        MethodReplace methodReplace = new MethodReplace();

        String s = methodReplace.replaceString.get();
        System.out.println(s);

    }
}
