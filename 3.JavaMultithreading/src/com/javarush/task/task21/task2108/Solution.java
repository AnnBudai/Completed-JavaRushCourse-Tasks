package com.javarush.task.task21.task2108;

import java.util.Arrays;

/*
Клонирование растений
*/
public class Solution {
    public static void main(String[] args) throws CloneNotSupportedException {
        Tree tree = new Tree("willow", new String[]{"s1", "s2", "s3", "s4"});
        Tree clone = (Tree) tree.clone();

        System.out.println(tree);
        System.out.println(clone);

        System.out.println(Arrays.toString(tree.branches));
        System.out.println(Arrays.toString(clone.branches));
        System.out.println(tree.getBranches() == clone.getBranches());


    }

    public static class Plant {
        private String name;

        public Plant(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class Tree extends Plant implements Cloneable {
        private String[] branches;

        public Tree(String name, String[] branches) {
            super(name);
            this.branches = branches;
        }

        public String[] getBranches() {
            return branches;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            Tree clone = (Tree) super.clone();
            clone.branches = this.branches.clone();
            return clone;
        }
    }
}
