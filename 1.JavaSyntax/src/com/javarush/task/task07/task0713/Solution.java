package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> commonArrayList = new ArrayList<>();
        ArrayList<Integer> for_3_ArrayList = new ArrayList<>();
        ArrayList<Integer> for_2_ArrayList = new ArrayList<>();
        ArrayList<Integer> othersArrayList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            commonArrayList.add(Integer.parseInt(bufferedReader.readLine()));
        }
        for (Integer integer : commonArrayList) {
            boolean isAlreadyAdded = false;
            if (integer % 3 == 0) {
                for_3_ArrayList.add(integer);
                isAlreadyAdded = true;
            }
            if (integer % 2 == 0) {
                for_2_ArrayList.add(integer);
                isAlreadyAdded = true;
            }
            if (!isAlreadyAdded) {
                othersArrayList.add(integer);
            }
        }

        printList(for_3_ArrayList);
        printList(for_2_ArrayList);
        printList(othersArrayList);

    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer integer : list) {
            System.out.println(integer);
        }

    }
}
