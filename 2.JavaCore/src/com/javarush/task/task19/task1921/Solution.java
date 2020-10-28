package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<>();
    public static final SimpleDateFormat inputDateFormat = new SimpleDateFormat("dd M yyyy");

    public static void main(String[] args) throws IOException, ParseException {
        if (args.length > 0) {
            BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
            while (fileReader.ready()) {
                String[] line = fileReader.readLine().split(" ");
                StringBuilder nameBuilder = new StringBuilder();
                for (int i = 0; i < line.length - 3; i++) {
                    nameBuilder.append(line[i]).append(" ");
                }
                PEOPLE.add(new Person(nameBuilder.toString().trim(), inputDateFormat.parse(line[line.length - 3] + " " + line[line.length - 2] + " " + line[line.length - 1])));
            }
            fileReader.close();
        }

    }
}
