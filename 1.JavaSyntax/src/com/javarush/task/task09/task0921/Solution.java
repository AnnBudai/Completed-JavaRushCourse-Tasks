package com.javarush.task.task09.task0921;

/* 
Метод в try..catch
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        try {
            while (true) {
                integerArrayList.add(Integer.parseInt(bufferedReader.readLine()));
            }
        } catch (NumberFormatException | IOException numberFormatException) {
            for (Integer integer : integerArrayList) {
                System.out.println(integer);
            }

        }
    }
}
