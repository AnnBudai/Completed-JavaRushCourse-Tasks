package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> stringArrayList = new ArrayList<>();

        int minLength = 1000000000;
        int maxLength = -1;

        for (int i = 0; i < 10; i++) {
            stringArrayList.add(bufferedReader.readLine());
            int currentStringLength = stringArrayList.get(i).length();
            if (currentStringLength < minLength) {
                minLength = currentStringLength;
            }
            if (currentStringLength > maxLength) {
                maxLength = currentStringLength;
            }
        }

        for (String string : stringArrayList) {
            if (string.length() == maxLength) {
                System.out.println(string);
                break;
            }
            if (string.length() == minLength) {
                System.out.println(string);
                break;
            }
        }
    }
}
