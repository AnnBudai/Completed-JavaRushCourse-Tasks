package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(Integer.parseInt(bufferedReader.readLine()));
        }

        int maxSequenceLength = 0;
        int currentSequenceLength = 1;
        int previousInt = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            int currentInt = arrayList.get(i);
            if (previousInt == currentInt) {
                currentSequenceLength++;
            } else {
                currentSequenceLength = 1;
            }
            if (currentSequenceLength > maxSequenceLength) {
                maxSequenceLength = currentSequenceLength;
            }
            previousInt = currentInt;
        }
        System.out.println(maxSequenceLength);

    }
}