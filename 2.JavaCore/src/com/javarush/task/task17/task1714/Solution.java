package com.javarush.task.task17.task1714;

public class Solution {
    public static void main(String[] args) {
        Beach beach_1 = new Beach("Beach_1", 15, 15);
        Beach beach_2 = new Beach("Beach_2", 10, 15);

        System.out.println(beach_1.compareTo(beach_2));
    }
}
