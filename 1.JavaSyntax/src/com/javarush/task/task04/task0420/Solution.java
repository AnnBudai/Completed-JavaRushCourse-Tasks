package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer[] myArray = new Integer[3];
        myArray[0] = Integer.parseInt(bufferedReader.readLine());
        myArray[1] = Integer.parseInt(bufferedReader.readLine());
        myArray[2] = Integer.parseInt(bufferedReader.readLine());
        Arrays.sort(myArray, Comparator.reverseOrder());
        for (int j : myArray) {
            System.out.print(j + " ");
        }

    }
}
