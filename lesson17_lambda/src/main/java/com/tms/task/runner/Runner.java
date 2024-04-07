package com.tms.task.runner;

import com.tms.task.method.Converter;
import com.tms.task.method.MethodReplace;

public class Runner {
    public static void main(String[] args) {
//------------------------------------------------------------------------- task1
        Double apply = Converter.parseBYNtoUSD.apply("615");
        System.out.println(apply);
//------------------------------------------------------------------------- task2
        Converter.parseConsumerBYNtoUSD.accept("1000");
//------------------------------------------------------------------------- task3
        String s = MethodReplace.replaceString.get();
        System.out.println(s);

    }
}
