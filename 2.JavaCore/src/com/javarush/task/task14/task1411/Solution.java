package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<String> keysSet = new HashSet<>(Arrays.asList("user", "loser", "coder", "proger"));
        while (true) {
            String string = reader.readLine();
            if (!keysSet.contains(string)) {
                break;
            } else {
                switch (string) {
                    case "user":
                        doWork(new Person.User());
                        break;
                    case "loser":
                        doWork(new Person.Loser());
                        break;
                    case "coder":
                        doWork(new Person.Coder());
                        break;
                    case "proger":
                        doWork(new Person.Proger());
                        break;
                }
            }
        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
    }
}
