package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Human child_1 = new Human("Илья", true, 19);
        Human child_2 = new Human("Настя", false, 15);
        Human child_3 = new Human("Том", true, 12);

        Human dad = new Human("Анатолий", true, 51, child_1, child_2, child_3);
        Human mom = new Human("Адэль", false, 40, child_1, child_2, child_3);

        Human grandad_1 = new Human("Владимир", true, 80, dad);
        Human grandmother_1 = new Human("Ефросиния", false, 83, dad);

        Human grandad_2 = new Human("Юрий", true, 68, mom);
        Human grandmother_2 = new Human("Ольга", false, 55, mom);

        System.out.println(grandad_1);
        System.out.println(grandmother_1);
        System.out.println(dad);

        System.out.println(grandad_2);
        System.out.println(grandmother_2);
        System.out.println(mom);

        System.out.println(child_1);
        System.out.println(child_2);
        System.out.println(child_3);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, Human... children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<>(Arrays.asList(children));
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
