package com.javarush.task.task07.task0705;

/* 
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbersArray = new int[20];
        int[] firstHalfArray = new int[10];
        int[] secondHalfArray = new int[10];
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = Integer.parseInt(reader.readLine());
            if (i < numbersArray.length / 2) {
                firstHalfArray[i] = numbersArray[i];
            } else {
                secondHalfArray[i - 10] = numbersArray[i];
                System.out.println(secondHalfArray[i - 10]);
            }
        }
    }
}
