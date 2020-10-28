package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int number = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        if (number > 0) {
            if (number % 2 == 0 && String.valueOf(number).length() == 1) {
                System.out.println("четное однозначное число");
            } else if (number % 2 != 0 && String.valueOf(number).length() == 1) {
                System.out.println("нечетное однозначное число");
            } else if (number % 2 == 0 && String.valueOf(number).length() == 2) {
                System.out.println("четное двузначное число");
            } else if (number % 2 != 0 && String.valueOf(number).length() == 2) {
                System.out.println("нечетное двузначное число");
            } else if (number % 2 == 0 && String.valueOf(number).length() == 3) {
                System.out.println("четное трехзначное число");
            } else if (number % 2 != 0 && String.valueOf(number).length() == 3) {
                System.out.println("нечетное трехзначное число");
            }
        }

    }
}
