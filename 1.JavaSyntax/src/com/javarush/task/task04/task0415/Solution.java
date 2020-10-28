package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double a = Integer.parseInt(bufferedReader.readLine());
        double b = Integer.parseInt(bufferedReader.readLine());
        double c = Integer.parseInt(bufferedReader.readLine());
        if (a >= b + c || b >= a + c || c >= a + b) {
            System.out.println("Треугольник не существует.");
        } else {
            System.out.println("Треугольник существует.");
        }

    }
}