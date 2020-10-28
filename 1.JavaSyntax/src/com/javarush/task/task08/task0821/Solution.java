package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("Солнышко", "Настя");
        hashMap.put("Солнышко", "Лена");
        hashMap.put("Назаров", "Дед");
        hashMap.put("Прудник", "Дед");
        hashMap.put("LastName1", "FirstName");
        hashMap.put("LastName2", "FirstName");
        hashMap.put("LastName3", "FirstName");
        hashMap.put("LastName4", "FirstName");
        hashMap.put("LastName5", "FirstName");
        hashMap.put("LastName6", "FirstName");
        return hashMap;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
