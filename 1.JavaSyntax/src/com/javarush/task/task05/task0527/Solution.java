package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat tomCat = new Cat("Tom", 5, 10.0);
        Dog bill = new Dog("Bill", "angry", 12.0);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat {
        String name;
        int age;
        double speed;

        public Cat(String name, int age, double speed) {
            this.name = name;
            this.age = age;
            this.speed = speed;
        }
    }

    public static class Dog {
        String name;
        String mood;
        double power;

        public Dog(String name, String mood, double power) {
            this.name = name;
            this.mood = mood;
            this.power = power;
        }
    }
}
