package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            stringArrayList.add(bufferedReader.readLine());
        }
        boolean listIsInAscendingOrder = true;
        int breakIndex = -1;
        int currentLength = -1;
        for (String s : stringArrayList) {
            if (s.length() < currentLength) {
                breakIndex = stringArrayList.indexOf(s);
                listIsInAscendingOrder = false;
                break;
            } else {
                currentLength = s.length();
            }
        }
        if (!listIsInAscendingOrder) {
            System.out.println(breakIndex);
        }
    }
}

