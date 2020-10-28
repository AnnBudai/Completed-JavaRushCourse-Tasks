package com.javarush.task.task07.task0707;

/* 
Что за список такой?
*/

import java.io.IOException;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        System.out.println(arrayList.size());
        for (String string : arrayList) {
            System.out.println(string);
        }

    }
}
