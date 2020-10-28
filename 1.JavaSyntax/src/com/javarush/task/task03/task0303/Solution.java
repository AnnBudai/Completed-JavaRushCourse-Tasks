package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(100,1.7));
        System.out.println(convertEurToUsd(2000,2));
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        return eur * exchangeRate;
    }
}
