package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        DateFormat dateFormat2 = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Ilya", dateFormat.parse("April 11 2002"));
        for (int i = 0; i < 8; i++) {
            map.put("person " + i, dateFormat2.parse(i + " 1" + i + " 200" + i));
        }
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        for (Iterator<Map.Entry<String, Date>> entryIterator = map.entrySet().iterator(); entryIterator.hasNext(); ) {
            int month = entryIterator.next().getValue().getMonth();
            if (month >= 5 && month < 8) {
                entryIterator.remove();
            }
        }

    }

    public static void main(String[] args) {
    }
}
