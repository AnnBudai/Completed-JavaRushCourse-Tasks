package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandad_1 = new Human("Ury", true, 75);
        Human grandmother_1 = new Human("Olga", false, 60);
        Human mom = new Human("Adel", false, 36, grandad_1, grandmother_1);

        Human grandad_2 = new Human("Vladimir", true, 0);
        Human grandmother_2 = new Human("Frosy", false, 83);
        Human dad = new Human("Anatoly", true, 50, grandad_2, grandmother_2);

        Human olderSon = new Human("Ilya", true, 18, dad, mom);
        Human daughter = new Human("Nasy", false, 14, dad, mom);
        Human youngerSon = new Human("Max", true, 7, dad, mom);

        System.out.println(grandad_1);
        System.out.println(grandad_2);

        System.out.println(grandmother_1);
        System.out.println(grandmother_2);

        System.out.println(dad);
        System.out.println(mom);

        System.out.println(olderSon);
        System.out.println(daughter);
        System.out.println(youngerSon);

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}