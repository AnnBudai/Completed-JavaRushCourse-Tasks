package com.javarush.task.task08.task0819;

import java.util.*;

/*
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        //напишите тут ваш код. step 3 - пункт 3
        cats.remove(cats.toArray()[0]);
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        return new HashSet<>(Arrays.asList(new Cat(), new Cat(), new Cat()));
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        public Cat() {
        }
    }
}
