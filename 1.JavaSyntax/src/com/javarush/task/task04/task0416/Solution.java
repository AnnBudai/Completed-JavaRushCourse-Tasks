package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        double time = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
        time = time % 5;
        if (time >= 4) {
            System.out.println("красный");
        } else if (time >= 3) {
            System.out.println("жёлтый");
        } else {
            System.out.println("зелный");
        }
    }
}
