package com.javarush.task.task18.task1809;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
        FileOutputStream fileOutputStream = new FileOutputStream(bufferedReader.readLine());

        byte[] buffer = new byte[fileInputStream.available()];
        fileInputStream.read(buffer);
        for (int left = 0, right = buffer.length - 1; left < right; left++, right--) {
            byte temp = buffer[left];
            buffer[left] = buffer[right];
            buffer[right] = temp;
        }
        fileOutputStream.write(buffer);

        bufferedReader.close();
        fileInputStream.close();
        fileOutputStream.close();

    }
}
