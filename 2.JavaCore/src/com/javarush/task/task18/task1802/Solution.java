package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int min = 255;
        try (FileInputStream fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine())) {
            while (fileInputStream.available() > 0) {
                int currByte = fileInputStream.read();
                if (currByte < min) min = currByte;
            }
        }
        System.out.println(min);

    }
}
