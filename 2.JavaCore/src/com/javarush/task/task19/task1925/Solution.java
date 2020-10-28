package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length > 1) {
            BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(args[1]));

            StringBuilder stringBuilder = new StringBuilder();
            while (fileReader.ready()) {
                String[] words = fileReader.readLine().trim().split(" ");
                for (String word : words) {
                    if (word.length() > 6) {
                        stringBuilder.append(word).append(",");
                    }
                }
            }

            String string = stringBuilder.toString().trim();
            fileWriter.write(string.substring(0, string.length() - 1));
            fileReader.close();
            fileWriter.close();
        }

    }
}
