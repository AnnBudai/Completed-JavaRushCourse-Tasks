package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Cat grandDad = new Cat(reader.readLine());
        Cat grandMom = new Cat(reader.readLine());


        Cat father = new Cat(reader.readLine(), null, grandDad);
        Cat mother = new Cat(reader.readLine(), grandMom, null);

        Cat son = new Cat(reader.readLine(), mother, father);
        Cat daughter = new Cat(reader.readLine(), mother, father);

        System.out.println(grandDad);
        System.out.println(grandMom);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(daughter);

    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        public Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            String outputString = "The cat's name is " + name + ", ";
            if (mother == null) {
                outputString += "no mother, ";
            } else {
                outputString += "mother is " + mother.name + ", ";
            }
            if (father == null) {
                outputString += "no father";
            } else {
                outputString += "father is " + father.name;
            }
            return outputString;
        }
    }

}
