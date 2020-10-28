package com.javarush.task.task22.task2209;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

/* 
Составить цепочку слов
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = null;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            fileReader = new BufferedReader(new FileReader(bufferedReader.readLine()));
        } catch (IOException e) {
            System.out.println("Exception occurred when there is file name input");
        }

        StringBuilder input = new StringBuilder();
        while (fileReader.ready()) {
            input.append(fileReader.readLine());
        }

        fileReader.close();

        StringBuilder result = getLine(input.toString().split(" "));
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        Set<String> set = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder(words[0]);
        set.add(words[0]);
        while (set.size() != words.length) {
            for (String word : words) {
                String current = stringBuilder.toString().trim();
                if (!set.contains(word)) {
                    if (word.substring(0, 1).equalsIgnoreCase(current.substring(current.length() - 1))) {
                        stringBuilder.append(" ").append(word);
                        set.add(word);
                    }
                }
            }
        }

        return stringBuilder;
    }
}
