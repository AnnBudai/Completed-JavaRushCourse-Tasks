package com.javarush.task.task08.task0820;

import java.lang.reflect.Array;
import java.util.*;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        return new HashSet<Cat>(Arrays.asList(new Cat(), new Cat(), new Cat(), new Cat()));
    }

    public static Set<Dog> createDogs() {
        return new HashSet<Dog>(Arrays.asList(new Dog(), new Dog(), new Dog()));
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> generalSet = new HashSet<>();
        generalSet.addAll(cats);
        generalSet.addAll(dogs);
        return generalSet;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        for (Cat cat : cats) {
            if (pets.contains(cat)) {
                pets.remove(cat);
            }
        }
    }

    public static void printPets(Set<Object> pets) {
        for (Object pet : pets) {
            System.out.println(pet);
        }

    }

    public static class Cat {
        public Cat() {
        }
    }

    public static class Dog {
        public Dog() {
        }
    }
}
