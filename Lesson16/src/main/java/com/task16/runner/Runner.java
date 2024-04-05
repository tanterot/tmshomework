package com.task16.runner;

import com.task16.method.Methods;

import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        String[] str = {"a", "a", "b", "c", "c"};
        String[] str1 = {"code", "bug"};

        //----------------------------------------- task1
        Methods methods = new Methods();
        Map<String, Boolean> resultArr = methods.returnArr(str);
        System.out.println(resultArr);
        //----------------------------------------- task2
        Map<String, String> resultArr1 = methods.firstEndChar(str1);
        System.out.println(resultArr1);
    }
}