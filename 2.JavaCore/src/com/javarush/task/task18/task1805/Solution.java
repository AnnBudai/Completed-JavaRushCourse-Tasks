package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        Set<Integer> byteSet = new HashSet<>();
        while (fileInputStream.available() > 0) {
            byteSet.add(fileInputStream.read());
        }
        fileInputStream.close();

        Arrays.sort(byteSet.toArray());
        System.out.println(byteSet.toString());
    }

}
