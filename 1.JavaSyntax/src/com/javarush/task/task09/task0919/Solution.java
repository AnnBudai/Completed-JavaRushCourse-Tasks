package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) {
        try {
            divideByZero();
        }catch (ArithmeticException arithmeticException){
            arithmeticException.printStackTrace();
        }

    }

    public static void divideByZero() {
        int x = 10 / 0;
        System.out.println(x);
    }
}
