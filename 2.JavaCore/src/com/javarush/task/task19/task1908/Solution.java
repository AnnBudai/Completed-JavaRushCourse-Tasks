package com.javarush.task.task19.task1908;

import java.io.*;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(bufferedReader.readLine()));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(bufferedReader.readLine()));

        StringBuilder text = new StringBuilder();
        while (fileReader.ready()) {
            text.append(fileReader.readLine());
        }
        text.trimToSize();

        for (String part : text.toString().replaceAll("\\s", " ").split(" ")) {
            try {
                Integer number = Integer.parseInt(part);
                fileWriter.write(number + " ");
            } catch (Exception e) {
            }
        }

        bufferedReader.close();
        fileReader.close();
        fileWriter.close();

    }
}
