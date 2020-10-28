package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String line = fileScanner.nextLine();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy");

            String[] personParameters = line.split(" ");
            String lastName = personParameters[0];
            String firstName = personParameters[1];
            String middleName = personParameters[2];
            Date birthDate = null;

            try {
                birthDate = simpleDateFormat.parse(String.format("%s %s %s", personParameters[3], personParameters[4], personParameters[5]));
            } catch (ParseException parseException) {
                System.out.println("Exceptions was caught when there was parsing of birthDate " + parseException.getMessage());
            }
            return new Person(firstName, middleName, lastName, birthDate);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
