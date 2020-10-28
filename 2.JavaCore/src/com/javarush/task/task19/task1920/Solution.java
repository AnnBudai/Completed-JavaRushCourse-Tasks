package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length > 0) {
            BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
            Map<String, Double> treeMap = new TreeMap<>();
            double max = 0.0;
            while (fileReader.ready()) {
                String[] line = fileReader.readLine().split(" ");
                Double oldValue = 0.0;

                if (treeMap.containsKey(line[0])) {
                    oldValue = treeMap.get(line[0]);
                }

                treeMap.put(line[0], Double.parseDouble(line[1]) + oldValue);

                if (treeMap.get(line[0]) > max) {
                    max = treeMap.get(line[0]);
                }
            }
            fileReader.close();
            for (Map.Entry<String, Double> entry : treeMap.entrySet()) {
                if (entry.getValue() == max) {
                    System.out.println(entry.getKey());
                }
            }

        }
    }
}
