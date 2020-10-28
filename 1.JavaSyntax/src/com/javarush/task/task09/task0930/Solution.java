package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Задача по алгоритмам Ӏ Java Syntax: 9 уровень, 11 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (String line : array) {
            if (isNumber(line)) {
                integerArrayList.add(Integer.parseInt(line));
            } else {
                stringArrayList.add(line);
            }
        }
        String[] stringArray = stringArrayList.toArray(new String[0]);
        for (int n = 0; n < stringArray.length; n++) {
            for (int i = 0; i < stringArray.length - 1; i++) {
                if (isGreaterThan(stringArray[i], stringArray[i + 1])) {
                    String buffer = stringArray[i];
                    stringArray[i] = stringArray[i + 1];
                    stringArray[i + 1] = buffer;
                }
            }
        }
        stringArrayList = new ArrayList<>(Arrays.asList(stringArray));
        integerArrayList.sort(Collections.reverseOrder());
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                array[i] = integerArrayList.remove(0) + "";
            } else {
                array[i] = stringArrayList.remove(0);
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
