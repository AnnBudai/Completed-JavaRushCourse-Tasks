package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) {
        LinkedList<Integer> bytesLinkedList = new LinkedList<>();
        try (FileInputStream fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());) {
            while (fileInputStream.available() > 0) {
                bytesLinkedList.add(fileInputStream.read());
            }
        } catch (Exception e) {
            System.out.println("Exception occurred when there is bytes reading:" + e.getMessage());
        }

        HashMap<Integer, Integer> bytesHashMap = new HashMap<>();

        for (Integer integer : bytesLinkedList) {
            if (bytesHashMap.containsKey(integer)) {
                bytesHashMap.put(integer, bytesHashMap.get(integer) + 1);
            } else {
                bytesHashMap.put(integer, 1);
            }
        }

        int maxCounter = 0;
        for (Integer integer : bytesLinkedList) {
            int curr = bytesHashMap.get(integer);
            if (curr > maxCounter) {
                maxCounter = curr;
            }
        }

        for (Integer integer : bytesLinkedList) {
            if (bytesHashMap.get(integer) == maxCounter) {
                System.out.print(integer + " ");
            }
        }

    }
}
