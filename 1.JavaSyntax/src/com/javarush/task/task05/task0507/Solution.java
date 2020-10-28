package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double number = 0;
        int counter = 0;
        while (true) {
            int currentNumber = Integer.parseInt(bufferedReader.readLine());
            if (currentNumber != -1) {
                number += currentNumber;
                counter++;
            } else {
                System.out.println(number / counter);
                break;
            }
        }
    }
}

