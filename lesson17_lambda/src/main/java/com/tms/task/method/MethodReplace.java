package com.tms.task.method;

import java.util.Scanner;
import java.util.function.Supplier;

//реврс строки
public class MethodReplace {
    public Supplier<String> replaceString = () -> {
        System.out.println("enter the line:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s == null) {
            return null;
        }
        return new StringBuilder(s).reverse().toString();
    };
}
