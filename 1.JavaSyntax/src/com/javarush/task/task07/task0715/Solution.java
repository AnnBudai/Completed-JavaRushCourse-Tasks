package com.javarush.task.task07.task0715;

/* 
Продолжаем мыть раму
*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        Collections.addAll(stringArrayList, "мама", "мыла", "раму");
        int stringArrayListSize = stringArrayList.size() + 2;
        for (int i = 0; i < stringArrayListSize; i++) {
            stringArrayList.add(i + 1, "именно");
            i++;
        }
        for (String string : stringArrayList) {
            System.out.println(string);
        }

    }

}
