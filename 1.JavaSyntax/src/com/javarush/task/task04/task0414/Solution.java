package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int year = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int amountOfDays;
        if (year % 400 == 0) {
            amountOfDays = 366;
        } else if (year % 100 == 0) {
            amountOfDays = 365;
        } else if (year % 4 == 0) {
            amountOfDays = 366;
        } else {
            amountOfDays = 365;
        }
        System.out.println("количество дней в году: " + amountOfDays);
    }
}