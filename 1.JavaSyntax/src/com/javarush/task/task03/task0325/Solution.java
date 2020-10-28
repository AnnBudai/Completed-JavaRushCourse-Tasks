package com.javarush.task.task03.task0325;

/* 
Финансовые ожидания
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        System.out.println("Я буду зарабатывать $" + n + " в час");
    }
}
