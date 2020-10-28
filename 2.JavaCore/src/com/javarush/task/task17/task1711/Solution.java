package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<>();
    public static SimpleDateFormat inputDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        if (args.length > 0) {
            switch (args[0]) {
                case "-c":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length - 1; ) {
                            if (args[i + 1].equalsIgnoreCase("м")) {
                                allPeople.add(Person.createMale(args[i], inputDateFormat.parse(args[i + 2])));
                            } else if (args[i + 1].equalsIgnoreCase("ж")) {
                                allPeople.add(Person.createFemale(args[i], inputDateFormat.parse(args[i + 2])));
                            }
                            System.out.println(allPeople.size() - 1);
                            i += 3;
                        }
                    }
                    break;
                case "-u":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length - 1; ) {
                            if (args[i + 2].equalsIgnoreCase("м")) {
                                allPeople.set(Integer.parseInt(args[i]), Person.createMale(args[i + 1], inputDateFormat.parse(args[i + 3])));
                            } else if (args[i + 2].equalsIgnoreCase("ж")) {
                                allPeople.set(Integer.parseInt(args[i]), Person.createFemale(args[i + 1], inputDateFormat.parse(args[i + 3])));
                            }
                            i += 4;
                        }
                    }
                    break;
                case "-d":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            Person deleted = allPeople.get(Integer.parseInt(args[i]));
                            deleted.setName(null);
                            deleted.setSex(null);
                            deleted.setBirthDate(null);
                        }
                    }
                    break;
                case "-i":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            System.out.println(allPeople.get(Integer.parseInt(args[i])));
                        }
                    }
                    break;
            }
        }

    }
}
