package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine().trim();
        String[] stringsArray = string.split("\\s+");
        String outputString = "";
        for (String str : stringsArray) {
            outputString += String.valueOf(str.charAt(0)).toUpperCase() + str.substring(1) + " ";
        }
        string = outputString;
        System.out.println(string);
    }
}
