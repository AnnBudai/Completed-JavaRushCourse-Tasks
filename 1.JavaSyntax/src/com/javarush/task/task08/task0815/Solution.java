package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> hashMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            hashMap.put("LastName " + i, "FirstName " + i);
        }
        return hashMap;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int counterSame = 0;
        for (String value : map.values()) {
            if (value.equals(name)) {
                counterSame++;
            }
        }
        return counterSame;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int counterSame = 0;
        for (String key : map.keySet()) {
            if (key.equals(lastName)) {
                counterSame++;
            }
        }
        return counterSame;
    }

    public static void main(String[] args) {

    }
}
