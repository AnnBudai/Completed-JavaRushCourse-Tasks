package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] myArray = new int[3];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = Integer.parseInt(bufferedReader.readLine());
        }

        if (!(myArray[0] != myArray[1] && myArray[0] != myArray[2] && myArray[1] != myArray[2])) {
            if (myArray[0] != myArray[1] && myArray[0] != myArray[2]) {
                System.out.println(1);
            } else if (myArray[1] != myArray[0] && myArray[1] != myArray[2]) {
                System.out.println(2);
            } else if (myArray[2] != myArray[0] && myArray[2] != myArray[1]) {
                System.out.println(3);
            }
        }
    }
}
