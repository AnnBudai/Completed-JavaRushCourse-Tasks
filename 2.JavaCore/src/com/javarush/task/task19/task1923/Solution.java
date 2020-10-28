package com.javarush.task.task19.task1923;

import java.io.*;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length > 1) {
            BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(args[1]));

            while (fileReader.ready()) {
                String[] words = fileReader.readLine().trim().split(" ");
                for (String word : words) {
                    for (int i = 0; i < word.length(); i++) {
                        if ((int) word.charAt(i) >= (int) '0' && (int) word.charAt(i) <= '9') {
                            fileWriter.write(word + " ");
                            break;
                        }
                    }
                }
            }

            fileReader.close();
            fileWriter.close();
        }
    }
}
