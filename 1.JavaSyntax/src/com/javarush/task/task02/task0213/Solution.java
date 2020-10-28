package com.javarush.task.task02.task0213;

/* 
Питомцам нужны люди
*/
public class Solution {
    public static void main(String[] args) {
        Woman hanna = new Woman();
        Cat seva = new Cat();
        seva.owner = hanna;
        Dog rick = new Dog();
        rick.owner = hanna;
        Fish nemo = new Fish();
        nemo.owner = hanna;

    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}
