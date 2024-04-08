package com.tms.task.runner;

import com.tms.task.method.Converter;
import com.tms.task.method.MethodReplace;
import com.tms.task.util.Constant;

public class Runner {
    public static void main(String[] args) {
//------------------------------------------------------------------------- task1
        Double apply = Converter.parseBYNtoUSD.apply(Constant.BYN);
        System.out.println(apply);
//------------------------------------------------------------------------- task2
        Converter.parseConsumerBYNtoUSD.accept(Constant.BYN);
//------------------------------------------------------------------------- task3
        String s = MethodReplace.replaceString.get();
        System.out.println(s);

    }
}
