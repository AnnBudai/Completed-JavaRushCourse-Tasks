package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        int number;
        do {
            number = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
            sum += number;
        } while (number != -1);
        System.out.println(sum);

    }
}
