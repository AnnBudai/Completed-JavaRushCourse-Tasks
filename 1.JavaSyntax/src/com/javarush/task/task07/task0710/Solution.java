package com.javarush.task.task07.task0710;

/* 
В начало списка
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            stringArrayList.add(0, bufferedReader.readLine());
        }
        for (String string : stringArrayList) {
            System.out.println(string);
        }

    }
}
