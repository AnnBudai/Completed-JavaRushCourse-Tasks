package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] myArray = new int[3];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = Integer.parseInt(bufferedReader.readLine());
        }
        int positiveCounter = 0;
        int negativeCounter = 0;
        for (int j : myArray) {
            if (j > 0) {
                positiveCounter++;
            } else if (j < 0) {
                negativeCounter++;
            }
        }

        System.out.println("количество отрицательных чисел: " + negativeCounter);
        System.out.println("количество положительных чисел: " + positiveCounter);
    }
}
