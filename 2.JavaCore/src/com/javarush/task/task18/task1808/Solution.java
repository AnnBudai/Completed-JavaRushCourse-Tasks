package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream_1 = new FileInputStream(bufferedReader.readLine());
        FileOutputStream fileOutputStream_2 = new FileOutputStream(bufferedReader.readLine());
        FileOutputStream fileOutputStream_3 = new FileOutputStream(bufferedReader.readLine());

        byte[] buffer;
        if (fileInputStream_1.available() % 2 != 0) {
            buffer = new byte[(fileInputStream_1.available() / 2) + 1];
        } else {
            buffer = new byte[fileInputStream_1.available() / 2];
        }

        int counter = fileInputStream_1.read(buffer);
        fileOutputStream_2.write(buffer, 0, counter);


        while (fileInputStream_1.available() > 0){
            fileOutputStream_3.write(fileInputStream_1.read());
        }

        bufferedReader.close();
        fileInputStream_1.close();
        fileOutputStream_2.close();
        fileOutputStream_3.close();

    }
}
