package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> hashMap = new HashMap<>();
        while (true) {
            String city = reader.readLine().trim();
            if (city.isEmpty()) {
                break;
            }
            String family = reader.readLine().trim();
            hashMap.put(city, family);
        }


        String desiredCity = reader.readLine().trim();

        if (desiredCity.length() > 0) {
            for (Map.Entry<String, String> pair : hashMap.entrySet()) {
                if (pair.getKey().trim().equals(desiredCity)) {
                    System.out.println(pair.getValue());
                }
            }
        }

        Thread current = Thread.currentThread();
        StackTraceElement[] methods = current.getStackTrace();

    }
}
