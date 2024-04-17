package com.task16.fabric;

import java.util.*;

/*
метод returnMapFromArray возврощает Map из массива символов где символ это ключ,
а значение boolean,true если символ в массиве повторяеться.
метод returnFirstCharKeyLastCharValue на вход принимает массив String , а на выход
возврощает Map, где ключ это первый символ а значение последний.
 */
public class Fabric {
    public static Map<String, Boolean> returnMapFromArray(String[] arr) {
        Map<String, Boolean> mapArr = new HashMap<>();
        for (String array : arr) {
            if (mapArr.containsKey(array)) {
                mapArr.put(array, true);
            } else {
                mapArr.put(array, false);
            }
        }
        return mapArr;
    }

    public static Map<String, String> returnFirstCharKeyLastCharValue(String[] arr) {
        Map<String, String> feChar = new HashMap<>();
        for (String array : arr) {
            String s = array;
            feChar.put(s.substring(0, 1), s.substring(s.length() - 1));
        }
        return feChar;
    }
}