package com.javarush.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Одинаковые слова в списке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<>();
        Set<String> uniqueWords = new HashSet<>();
        int counter = 1;
        for (int i = 0; i < list.size(); i++) {
            String mainString = list.get(i);
            if (!uniqueWords.contains(mainString)) {
                for (int j = 0; j < list.size(); j++) {
                    if (i != j && mainString.equals(list.get(j))) {
                        counter++;
                    }
                }
                result.put(mainString, counter);
                uniqueWords.add(mainString);
                counter = 1;
            }
        }
        return result;
    }

}

