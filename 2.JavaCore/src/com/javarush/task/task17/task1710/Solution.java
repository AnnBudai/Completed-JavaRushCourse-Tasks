package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static final SimpleDateFormat inputSimpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    public static final SimpleDateFormat outputSimpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    public static void main(String[] args) throws ParseException {
        if (args.length > 0) {
            switch (args[0]) {
                case "-c":
                    if (args[2].equals("м")) {
                        allPeople.add(Person.createMale(args[1], inputSimpleDateFormat.parse(args[3])));
                    } else {
                        allPeople.add(Person.createFemale(args[1], inputSimpleDateFormat.parse(args[3])));
                    }
                    System.out.println(allPeople.size() - 1);
                    break;

                case "-u":
                    if (args[2].equals("м")) {
                        allPeople.set(Integer.parseInt(args[1]), Person.createMale(args[2], inputSimpleDateFormat.parse(args[4])));
                    } else {
                        allPeople.set(Integer.parseInt(args[1]), Person.createFemale(args[2], inputSimpleDateFormat.parse(args[4])));
                    }
                    break;
                case "-d":
                    Person person = allPeople.get(Integer.parseInt(args[1]));
                    person.setName(null);
                    person.setSex(null);
                    person.setBirthDate(null);
                    break;
                case "-i":
                    System.out.println(allPeople.get(Integer.parseInt(args[1])));
            }
        }
    }
}
