package com.task16.runner;

import com.task16.fabric.Fabric;

import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        String[] str = {"a", "a", "b", "c", "c"};
        String[] str1 = {"code", "bug"};

        //----------------------------------------- task1
        Map<String, Boolean> resultArr = Fabric.returnMapFromArray(str);
        System.out.println(resultArr);
        //----------------------------------------- task2
        Map<String, String> resultArr1 = Fabric.returnFirstCharKeyLastCharValue(str1);
        System.out.println(resultArr1);
    }
}