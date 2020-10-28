package com.javarush.task.task02.task0217;

/* 
Минимум четырех чисел
*/
public class Solution {
    public static int min(int a, int b, int c, int d) {
        int min1 = min(a, b);
        int min2 = min(c, d);
        if (min1 < min2) {
            return min1;
        } else {
            return min2;
        }

    }

    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}