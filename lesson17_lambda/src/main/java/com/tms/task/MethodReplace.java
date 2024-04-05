package com.tms.task;

import java.util.Scanner;
import java.util.function.Supplier;
//реврс строки
public class MethodReplace {
    Supplier<String> replaceString = () -> {
        System.out.println("enter the line:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return new StringBuilder(s).reverse().toString();
    };
}
