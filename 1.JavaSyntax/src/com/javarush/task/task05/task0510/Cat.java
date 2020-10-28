package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name;
    int weight;
    int age;
    String color;
    String address;

    public void initialize(String name) {
        this.name = name;
        weight = 5;
        age = 5;
        color = "black";
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        weight = 5;
        color = "black";
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "black";
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        age = 5;
    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        age = 5;
    }


    public static void main(String[] args) {

    }
}
