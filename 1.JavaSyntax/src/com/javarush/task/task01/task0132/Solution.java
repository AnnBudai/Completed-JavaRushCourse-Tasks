package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        String numberString = number + "";
        int sum = 0;
        for (int i = 0; i < numberString.length(); i++) {
            sum += Integer.parseInt(numberString.charAt(i) + "" );
        }
        return sum;
    }
}