package com.javarush.task.task06.task0606;

/* 
Чётные и нечётные циферки
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static int even = 0;
    public static int odd = 0;

    public static void main(String[] args) throws IOException {
        String number = new BufferedReader(new InputStreamReader(System.in)).readLine();
        if (Integer.parseInt(number) > 0) {
            for (int i = 0; i < number.length(); i++) {
                if (Integer.parseInt(String.valueOf(number.charAt(i))) % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }

        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
