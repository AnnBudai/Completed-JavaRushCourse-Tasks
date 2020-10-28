package com.javarush.task.task19.task1919;

import com.sun.org.apache.bcel.internal.generic.D2F;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;


/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        Map<String, Double> treeMap = new TreeMap<>();
        while (fileReader.ready()) {
            String[] line = fileReader.readLine().split(" ");
            Double oldValue = 0.0;
            if (treeMap.containsKey(line[0])) {
                oldValue = treeMap.get(line[0]);
            }
            treeMap.put(line[0], Double.parseDouble(line[1]) + oldValue);
        }
        fileReader.close();
        for (Map.Entry<String, Double> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
