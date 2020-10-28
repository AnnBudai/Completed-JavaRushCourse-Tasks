package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/*
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream console = System.out;

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));
        testString.printSomething();

        String[] result = byteArrayOutputStream.toString().split(" ");

        System.setOut(console);

        switch (result[1]) {
            case "+":
                System.out.println(byteArrayOutputStream.toString().trim() + " " + (Integer.parseInt(result[0]) + Integer.parseInt(result[2])));
                break;
            case "-":
                System.out.println(byteArrayOutputStream.toString().trim() + " " + (Integer.parseInt(result[0]) - Integer.parseInt(result[2])));
                break;
            case "*":
                System.out.println(byteArrayOutputStream.toString().trim() + " " + (Integer.parseInt(result[0]) * Integer.parseInt(result[2])));
                break;
        }


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

