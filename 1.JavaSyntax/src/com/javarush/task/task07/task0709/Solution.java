package com.javarush.task.task07.task0709;

/* 
Выражаемся покороче
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> stringArrayList = new ArrayList<>();
        int minLength = 1000000000;
        for (int i = 0; i < 5; i++) {
            stringArrayList.add(bufferedReader.readLine());
            int currentStringLength = stringArrayList.get(i).length();
            if (currentStringLength < minLength) {
                minLength = currentStringLength;
            }
        }
        for (String string : stringArrayList) {
            if (string.length() == minLength) {
                System.out.println(string);
            }
        }


    }
}
