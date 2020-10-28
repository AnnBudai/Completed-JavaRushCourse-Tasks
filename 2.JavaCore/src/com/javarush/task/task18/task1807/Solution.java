package com.javarush.task.task18.task1807;

import java.io.*;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int commaCount = 0;
        while (fileInputStream.available() > 0) {
            if (String.valueOf(fileInputStream.read()).equals(",")) {
                commaCount++;
            }
        }
        fileInputStream.close();

        System.out.println(commaCount);


    }
}
