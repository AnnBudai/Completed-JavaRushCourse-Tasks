package com.javarush.task.task18.task1820;

import java.io.*;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();
        FileInputStream fIS = new FileInputStream(fileName1);
        FileOutputStream fOS = new FileOutputStream(fileName2);
        byte[] buff = new byte[fIS.available()];
        fIS.read(buff);
        fIS.close();
        String[] s = new String(buff).split(" ");
        for (int i = 0; i < s.length; i++) {
            s[i] = String.valueOf((int) (Math.round(Double.parseDouble(s[i]))));
        }
        buff = String.join(" ", s).getBytes();
        fOS.write(buff);
        fOS.close();
    }
}
