package com.javarush.task.task21.task2104;

import java.util.HashSet;
import java.util.Set;

/*
Equals and HashCode
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object.getClass() != Solution.class) {
            return false;
        }
        return ((Solution) object).first.equals(first) && ((Solution) object).last.equals(last);
    }

    public int hashCode() {
        if (first == null && last == null) {
            return 0;
        }
        return first.hashCode() + last.hashCode();
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));
    }
}
