package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader reader = new FileReader(bufferedReader.readLine())) {
            while (reader.ready()) {
                stringBuilder.append((char) reader.read());

            }
        }
        bufferedReader.close();

        String replacedString = stringBuilder.toString().replaceAll("\\p{P}", " ").replaceAll("\\s", " ");

        int counter = 0;
        for (String word : replacedString.split(" ")) {
            if (word.equals("world")) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
