package com.tms.task.runner;

import com.tms.task.method.Converter;
import com.tms.task.method.MethodReplace;
import com.tms.task.util.Constant;

public class Runner {
    public static void main(String[] args) {
//------------------------------------------------------------------------- task1
        String apply = Converter.parseBYNtoUSD.apply("328 BYN");
        System.out.println(apply);
//------------------------------------------------------------------------- task2
        Converter.parseConsumerBYNtoUSD.accept("1000 BYN");
//------------------------------------------------------------------------- task3
        String s = MethodReplace.replaceString.get();
        System.out.println(s);

    }
}
