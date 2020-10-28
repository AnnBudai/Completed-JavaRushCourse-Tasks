package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int powerCat_1_Counter = 0;
        int powerCat_2_Counter = 0;

        if (this.age > anotherCat.age) {
            powerCat_1_Counter++;
        } else if (this.age == anotherCat.age) {
            powerCat_1_Counter++;
            powerCat_2_Counter++;
        } else {
            powerCat_2_Counter++;
        }

        if (this.weight > anotherCat.weight) {
            powerCat_1_Counter++;
        } else if (this.weight == anotherCat.weight) {
            powerCat_1_Counter++;
            powerCat_2_Counter++;
        } else {
            powerCat_2_Counter++;
        }

        if (this.strength > anotherCat.strength) {
            powerCat_1_Counter++;
        } else if (this.strength == anotherCat.strength) {
            powerCat_1_Counter++;
            powerCat_2_Counter++;
        } else {
            powerCat_2_Counter++;
        }

        return powerCat_1_Counter >= powerCat_2_Counter;

    }

    public static void main(String[] args) {

    }
}
