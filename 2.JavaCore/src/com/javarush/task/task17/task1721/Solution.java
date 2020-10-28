package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<>();
    public static List<String> forRemoveLines = new ArrayList<>();

    public static void main(String[] args) {
        Solution solution = new Solution();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader_1 = new BufferedReader(new FileReader(bufferedReader.readLine().trim()));
             BufferedReader fileReader_2 = new BufferedReader(new FileReader(bufferedReader.readLine().trim()))) {

            while (fileReader_1.ready()) {
                solution.allLines.add(fileReader_1.readLine());
            }
            while (fileReader_2.ready()) {
                solution.forRemoveLines.add(fileReader_2.readLine());
            }
        } catch (IOException e) {
            System.out.println("Exception caught when there is file reading");
        }

        try {
            solution.joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
