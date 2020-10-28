package com.javarush.task.task22.task2203;

/*
Между табуляциями
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        try {
            string = string.trim().substring(string.indexOf("\t") + 1);
            string = string.substring(0, string.indexOf("\t"));
            return string;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new TooShortStringException();
        }
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("JavaRush - \tлучший сервис\tобучения Java\t."));
    }
}
