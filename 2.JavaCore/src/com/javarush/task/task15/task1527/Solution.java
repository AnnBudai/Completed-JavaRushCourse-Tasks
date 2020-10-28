package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String url = new BufferedReader(new InputStreamReader(System.in)).readLine();
        Matcher matcher = Pattern.compile("[\\w|=|\\d\\\\.]+(?=&|$)").matcher(url);
        ArrayList<String> arrayListParameters = new ArrayList<>();
        while (matcher.find()) {
            String str = matcher.group();
            arrayListParameters.add(str);
            if (str.contains("=")) {
                System.out.print(str.split("=")[0] + " ");
            } else {
                System.out.print(str + " ");
            }
        }
        System.out.println();
        for (String item : arrayListParameters) {
            item = item.trim();
            if (item.contains("obj")) {
                if (item.contains("=")) {
                    String value = item.split("=")[1];
                    try {
                        alert(Double.parseDouble(value));
                    } catch (Exception e) {
                        alert(value);
                    }
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
