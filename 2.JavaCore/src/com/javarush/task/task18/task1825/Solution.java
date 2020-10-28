package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.TreeSet;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<String> treeSet = new TreeSet<>();
        String input;
        while (!(input = bufferedReader.readLine()).equals("end")) {
            treeSet.add(input);
        }
        bufferedReader.close();

        FileOutputStream fileOutputStream = new FileOutputStream("Lion.avi");
        for (String string : treeSet) {
            fileOutputStream.write(string.getBytes());
        }

    }
}
