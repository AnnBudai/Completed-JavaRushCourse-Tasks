package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle() {
    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double x, double radius) {
        this.x = x;
        this.y = 0;
        this.radius = radius;
    }

    public Circle(Circle circle, double radius) {
        this.x = circle.x;
        this.y = circle.y;
        this.radius = radius;
    }


    public static void main(String[] args) {

    }
}