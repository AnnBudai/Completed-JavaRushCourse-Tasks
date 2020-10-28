package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        String[] wordsArray = {"Мама", "Мыла", "Раму"};
        for (int a = 0; a < wordsArray.length; a++) {
            for (int b = 0; b < wordsArray.length; b++) {
                for (int c = 0; c < wordsArray.length; c++) {
                    if (a != b && a != c && b != c) {
                        System.out.println(wordsArray[a] + wordsArray[b] + wordsArray[c]);
                    }
                }
            }
        }

    }
}
