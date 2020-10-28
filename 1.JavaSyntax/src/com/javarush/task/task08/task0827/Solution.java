package com.javarush.task.task08.task0827;

/* 
Работа с датой
*/

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));

    }

    public static boolean isDateOdd(String dateString) throws ParseException {
        DateFormat format = new SimpleDateFormat("MMMM dd yyyy", Locale.ENGLISH);
        Date currentDate = format.parse(dateString);
        Calendar startOfYear = new GregorianCalendar();
        startOfYear.set(Calendar.YEAR, currentDate.getYear());
        startOfYear.set(Calendar.MONTH, 0);
        startOfYear.set(Calendar.DAY_OF_MONTH, 1);
        return ((currentDate.getTime() - startOfYear.getTimeInMillis()) / (1000 * 60 * 60 * 24)) % 2 != 0;
    }
}
