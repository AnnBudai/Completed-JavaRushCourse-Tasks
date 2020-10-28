package com.javarush.task.task18.task1801;

import java.io.*;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int max = 0;
        while (fileInputStream.available() > 0) {
            int cur = fileInputStream.read();
            if (cur > max) {
                max = cur;
            }
        }

        PrintStream console = System.out;
        console.println(max);

        fileInputStream.close();
        console.close();
    }
}
