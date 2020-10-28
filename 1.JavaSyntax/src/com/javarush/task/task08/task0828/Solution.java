package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>(Collections.singletonList(bufferedReader.readLine()));
        SimpleDateFormat format = new SimpleDateFormat("MMMM",Locale.ENGLISH);
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.MONTH, format.parse(arrayList.get(0)).getMonth());
        System.out.println(arrayList.get(0) + " is the " + (calendar.get(Calendar.MONTH) + 1) + " month");
    }
}
