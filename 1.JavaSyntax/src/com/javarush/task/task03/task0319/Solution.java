package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        int number_1 = Integer.parseInt(bufferedReader.readLine());
        int number_2 = Integer.parseInt(bufferedReader.readLine());
        System.out.println(name + " получает " + number_1 + " через " + number_2 + " лет.");
    }
}
