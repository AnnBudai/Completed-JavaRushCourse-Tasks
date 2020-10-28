package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = null;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            fileReader = new BufferedReader(new FileReader(bufferedReader.readLine()));
        } catch (IOException e) {
            System.out.println("Exception occurred when there is file name input");
        }
        ArrayList<String> words = new ArrayList<>();
        while (fileReader.ready()) {
            words.addAll(Arrays.asList(fileReader.readLine().split(" ")));
        }

        for (String word_1 : words) {
            for (String word_2 : words) {
                String reversString = new StringBuilder(word_1).reverse().toString();
                if (word_2.equals(reversString)) {
                    Pair pair = new Pair(word_1, word_2);
                    Pair pair2 = new Pair(word_2, word_1);
                    if (!result.contains(pair) && !result.contains(pair2)) {
                        result.add(pair);
                    }
                }
            }
        }

        for (Pair pair : result) {
            System.out.println(pair);
        }


        fileReader.close();
    }

    public static class Pair {
        String first;
        String second;

        public Pair(String first, String second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (!Objects.equals(first, pair.first)) return false;
            return Objects.equals(second, pair.second);

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
