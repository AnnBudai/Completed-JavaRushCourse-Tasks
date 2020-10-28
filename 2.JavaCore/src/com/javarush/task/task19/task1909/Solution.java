package com.javarush.task.task19.task1909;

import java.io.*;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(bufferedReader.readLine()));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(bufferedReader.readLine()));
        bufferedReader.close();
        while (fileReader.ready()) {
            char ch = (char) fileReader.read();
            if (ch == '.') {
                fileWriter.write("!");
            } else {
                fileWriter.write(ch);
            }
        }

        fileReader.close();
        fileWriter.close();
    }
}
