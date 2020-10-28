package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] array = getInts();
        int maximum = array[0];
        int minimum = array[0];
        for (int number : array) {
            if (number > maximum) {
                maximum = number;
            }
            if (number < minimum) {
                minimum = number;
            }
        }

        System.out.print(maximum + " " + minimum);
    }

    public static int[] getInts() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(bufferedReader.readLine());
        }
        return array;
    }
}
