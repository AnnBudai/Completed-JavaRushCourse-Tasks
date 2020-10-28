package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbersArray = new int[20];
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = Integer.parseInt(reader.readLine());
        }
        return numbersArray;
    }

    public static int max(int[] array) {
        int max = 0;
        if (array.length > 0) {
            max = array[0];
            for (int j : array) {
                if (j > max) {
                    max = j;
                }
            }
        }
        return max;
    }
}
