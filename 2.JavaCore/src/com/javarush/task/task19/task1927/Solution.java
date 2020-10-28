package com.javarush.task.task19.task1927;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Контекстная реклама
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream console = System.out;

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));
        testString.printSomething();
        System.setOut(console);
        int counter = 0;
        for (String string : byteArrayOutputStream.toString().trim().split("\n")) {
            if (counter == 2) {
                System.out.println("JavaRush - курсы Java онлайн");
                counter = 0;
            }
            System.out.println(string);
            counter++;
        }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
