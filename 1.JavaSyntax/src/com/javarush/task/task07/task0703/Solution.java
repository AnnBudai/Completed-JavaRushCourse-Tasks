package com.javarush.task.task07.task0703;

/* 
Общение одиноких массивов
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] stringsArray = new String[10];
        int[] numbersArray = new int[10];

        for (int i = 0; i < stringsArray.length; i++) {
            stringsArray[i] = reader.readLine();
            numbersArray[i] = stringsArray[i].length();
            System.out.println(numbersArray[i]);
        }
    }
}
