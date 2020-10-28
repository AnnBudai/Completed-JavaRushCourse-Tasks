package com.javarush.task.task07.task0711;

/* 
Удалить и вставить
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            stringArrayList.add(bufferedReader.readLine());
        }
        for (int i = 0; i < 13; i++) {
            String lastString = stringArrayList.remove(stringArrayList.size() - 1);
            stringArrayList.add(0, lastString);
        }
        for (String string : stringArrayList) {
            System.out.println(string);
        }

    }
}
