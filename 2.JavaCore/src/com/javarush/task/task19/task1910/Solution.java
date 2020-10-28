package com.javarush.task.task19.task1910;

import java.io.*;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(bufferedReader.readLine()));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(bufferedReader.readLine()));
        bufferedReader.close();

        StringBuilder stringBuilder = new StringBuilder();
        while (fileReader.ready()) {
            stringBuilder.append(fileReader.readLine());
        }
        fileReader.close();

        String replacedString = stringBuilder.toString().replaceAll("\\p{P}", "").replaceAll("\\n", "");
        fileWriter.write(replacedString);

        fileWriter.close();
    }
}
