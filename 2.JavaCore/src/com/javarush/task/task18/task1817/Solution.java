package com.javarush.task.task18.task1817;

import java.io.FileInputStream;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);

        int countLetters = 0;
        int countSpaces = 0;
        while (fileInputStream.available() > 0) {
            countLetters++;
            if (fileInputStream.read() == ' ') countSpaces++;
        }

        float result = ((float) countSpaces / countLetters * 100);

        System.out.printf("%.2f%n", result);

        fileInputStream.close();
    }
}
