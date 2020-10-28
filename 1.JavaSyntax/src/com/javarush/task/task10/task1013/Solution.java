package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int age;
        private String firstName;
        private String lastName;
        private int weight;
        private int height;
        private boolean sex;

        public Human(String lastName, int weight, int height, boolean sex) {
            this.lastName = lastName;
            this.weight = weight;
            this.height = height;
            this.sex = sex;
        }

        public Human(String firstName, String lastName, int weight, int height, boolean sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.weight = weight;
            this.height = height;
            this.sex = sex;
        }

        public Human(int weight, int height, boolean sex) {
            this.weight = weight;
            this.height = height;
            this.sex = sex;
        }

        public Human(int age, String firstName, String lastName) {
            this.age = age;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Human(int age, String firstName, String lastName, int weight, int height, boolean sex) {
            this.age = age;
            this.firstName = firstName;
            this.lastName = lastName;
            this.weight = weight;
            this.height = height;
            this.sex = sex;
        }

        public Human(boolean sex) {
            this.sex = sex;
        }

        public Human(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }

        public Human(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Human(String firstName) {
            this.firstName = firstName;
        }

        public Human(int age) {
            this.age = age;
        }
    }
}
