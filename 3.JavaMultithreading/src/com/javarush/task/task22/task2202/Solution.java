package com.javarush.task.task22.task2202;

import java.util.ArrayList;
import java.util.Arrays;

/*
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        try {
            ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(string.split(" ")));
            String output = "";
            for (int i = 1; i < 5; i++) {
                output += arrayList.get(i) + " ";
            }
            return output;
        } catch (Exception e) {
            throw new TooShortStringException();
        }

    }

    public static class TooShortStringException extends RuntimeException {

    }
}
