package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        PrintStream consolePrint = System.out;

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));
        testString.printSomething();
        String result = byteArrayOutputStream.toString();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fileOutputStream = new FileOutputStream(bufferedReader.readLine());
        bufferedReader.close();
        fileOutputStream.write(byteArrayOutputStream.toByteArray());
        fileOutputStream.close();

        System.setOut(consolePrint);
        System.out.println(result);


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

