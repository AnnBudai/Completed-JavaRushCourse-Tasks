package com.javarush.task.task14.task1419;

import java.io.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {
        Collections.addAll(exceptions,
                new ArrayStoreException(),
                new NullPointerException(),
                new NumberFormatException(),
                new ArithmeticException(),
                new ArrayIndexOutOfBoundsException(),
                new EmptyStackException(),
                new IllegalStateException(),
                new IllegalThreadStateException(),
                new NegativeArraySizeException(),
                new SecurityException());
    }
}
