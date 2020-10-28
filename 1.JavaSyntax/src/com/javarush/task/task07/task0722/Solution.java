package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> stringArrayList = new ArrayList<>();
        while (true) {
            String currentString = reader.readLine();
            if (currentString.equals("end")) {
                break;
            } else {
                stringArrayList.add(currentString);
            }
        }
        for (String string : stringArrayList) {
            System.out.println(string);
        }

    }
}