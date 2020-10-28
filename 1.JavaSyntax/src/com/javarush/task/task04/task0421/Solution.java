package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name_1 = bufferedReader.readLine();
        String name_2 = bufferedReader.readLine();
        if (name_1.equals(name_2)){
            System.out.println("Имена идентичны");
        }else if (name_1.length() == name_2.length()){
            System.out.println("Длины имен равны");
        }

    }
}
