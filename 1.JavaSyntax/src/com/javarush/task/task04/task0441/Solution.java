package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        int[] myArray = new int[3];
        myArray[0] = a;
        myArray[1] = b;
        myArray[2] = c;
        int min = a;
        int max = a;
        for (int i : myArray) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > min && myArray[i] < max) {
                System.out.println(myArray[i]);
                break;
            }
        }

        if (myArray[0] == myArray[1]) {
            System.out.println(myArray[0]);
        } else if (myArray[1] == myArray[2]) {
            System.out.println(myArray[1]);
        } else if (myArray[0] == myArray[2]) {
            System.out.println(myArray[0]);
        }
    }
}
