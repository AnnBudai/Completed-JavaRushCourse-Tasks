package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        while (fileInputStream.available() > 0) {
            integerLinkedList.add(fileInputStream.read());
        }
        fileInputStream.close();

        HashMap<Integer, Integer> counterHashMap = new HashMap<>();
        for (Integer integer : integerLinkedList) {
            if (counterHashMap.containsKey(integer)) {
                counterHashMap.put(integer, counterHashMap.get(integer) + 1);
            } else {
                counterHashMap.put(integer, 1);
            }
        }

        int min = 255;
        for (Integer integer : integerLinkedList) {
            int curr = counterHashMap.get(integer);
            if (curr < min) {
                min = curr;
            }
        }

        for (Integer integer : integerLinkedList) {
            if (counterHashMap.get(integer) == min) {
                System.out.print(integer + " ");
            }
        }


    }
}
