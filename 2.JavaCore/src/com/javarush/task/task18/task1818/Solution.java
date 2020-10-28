package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = in.readLine();
        String fileName2 = in.readLine();
        String fileName3 = in.readLine();

        FileInputStream fileInputStream2 = new FileInputStream(fileName2);
        FileInputStream fileInputStream3 = new FileInputStream(fileName3);
        FileOutputStream fileOutputStream1_1 = new FileOutputStream(fileName1);
        FileOutputStream fileOutputStream1_2 = new FileOutputStream(fileName1);

        byte[] buffer2 = new byte[fileInputStream2.available()];
        byte[] buffer3 = new byte[fileInputStream3.available()];

        fileInputStream2.read(buffer2);
        fileInputStream3.read(buffer3);

        fileOutputStream1_1.write(buffer2);
        fileOutputStream1_2.write(buffer3);

        fileInputStream2.close();
        fileInputStream3.close();
        fileOutputStream1_1.close();
        fileOutputStream1_2.close();
    }
}
