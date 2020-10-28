package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbersArray = new int[15];
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = Integer.parseInt(reader.readLine());
        }
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            if (i % 2 == 0) {
                evenCount += numbersArray[i];
            } else {
                oddCount += numbersArray[i];
            }
        }
        if (evenCount > oddCount) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }

    }
}
