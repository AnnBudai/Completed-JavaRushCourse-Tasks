package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        while (true) {
            try {
                int id = Integer.parseInt(reader.readLine());
                String name = reader.readLine();
                stringIntegerHashMap.put(name, id);
            } catch (NumberFormatException e) {
                break;
            }
        }
        for (Map.Entry<String, Integer> entry : stringIntegerHashMap.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }

    }
}
