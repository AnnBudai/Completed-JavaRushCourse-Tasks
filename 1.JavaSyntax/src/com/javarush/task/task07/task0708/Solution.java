package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        int maxLength = -1;
        for (int i = 0; i < 5; i++) {
            strings.add(bufferedReader.readLine());
            int currentStringLength = strings.get(i).length();
            if (currentStringLength > maxLength) {
                maxLength = currentStringLength;
            }
        }
        for (String string : strings) {
            if (string.length() == maxLength) {
                System.out.println(string);
            }
        }

    }
}
