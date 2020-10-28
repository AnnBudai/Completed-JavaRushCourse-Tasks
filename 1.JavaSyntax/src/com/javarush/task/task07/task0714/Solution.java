package com.javarush.task.task07.task0714;

/* 
Слова в обратном порядке
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            stringArrayList.add(bufferedReader.readLine());
        }
        stringArrayList.remove(2);
        for (int i = stringArrayList.size() - 1; i >= 0; i--) {
            System.out.println(stringArrayList.get(i));
        }

    }
}
