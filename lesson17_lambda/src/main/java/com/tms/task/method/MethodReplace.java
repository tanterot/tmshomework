package com.tms.task.method;

import java.util.Scanner;
import java.util.function.Supplier;
/*
реверс строки
static так как нет полей класса и есть только методы
 */
public class MethodReplace {
    public static Supplier<String> replaceString = () -> {
        System.out.println("enter the line:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s == null) {
            return null;
        }
        return new StringBuilder(s).reverse().toString();
    };
}
