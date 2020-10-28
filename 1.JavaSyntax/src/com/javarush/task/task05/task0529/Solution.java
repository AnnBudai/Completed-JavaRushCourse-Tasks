package com.javarush.task.task05.task0529;

/* 
Консоль-копилка
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        String currentLine = "";
        while (true) {
            currentLine = bufferedReader.readLine();
            if (currentLine.equals("сумма")) {
                break;
            } else {
                sum += Integer.parseInt(currentLine);
            }
        }
        System.out.println(sum);
    }
}
