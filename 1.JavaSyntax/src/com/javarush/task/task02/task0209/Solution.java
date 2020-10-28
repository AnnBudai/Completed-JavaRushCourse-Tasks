package com.javarush.task.task02.task0209;

/*
Макс, Белла и Джек
*/
public class Solution {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Max";
        Dog bella = new Dog();
        bella.name = "Bella";
        Dog jack = new Dog();
        jack.name = "Jack";
    }

    public static class Dog {
        public String name;
    }
}
