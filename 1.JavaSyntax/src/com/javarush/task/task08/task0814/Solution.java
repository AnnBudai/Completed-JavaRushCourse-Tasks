package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> integerSet = new HashSet<>();
        while (integerSet.size() < 20) {
            integerSet.add(new Random().nextInt(100));
        }
        return integerSet;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        for (Iterator<Integer> iterator = set.iterator(); iterator.hasNext();) {
            if (iterator.next() > 10) {
                iterator.remove();
            }
        }
        return set;
    }

    public static void main(String[] args) {

    }
}
