package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> hashMap = new HashMap<>();
        for (int i = 0; i < 3; i++) { // 9 записей в мапу
            hashMap.put("Дед " + i, "Назар");
            hashMap.put("Бабка " + i, "Таруса");
            hashMap.put("Солнышко " + i, "Анастасия");
        }
        hashMap.put("LastName", "Firstname");

        return hashMap;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        HashMap<String, String> copy = new HashMap<>(map);
        int previousMapSize = map.size();
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            removeItemFromMapByValue(map, pair.getValue());
            if (previousMapSize - map.size() == 1) {
                map.put(pair.getKey(), pair.getValue());
            }
            previousMapSize = map.size();
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
    }
}
