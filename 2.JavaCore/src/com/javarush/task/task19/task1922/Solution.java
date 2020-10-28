package com.javarush.task.task19.task1922;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(bufferedReader.readLine()));
        bufferedReader.close();
        while (fileReader.ready()) {
            String line = fileReader.readLine();
            String[] wordsFromLine = line.split(" ");
            int counter = 0;
            for (String word : wordsFromLine) {
                if (words.contains(word)) {
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.println(line);
            }
        }

        fileReader.close();


    }
}
