package com.javarush.task.task09.task0922;

/* 
Какое сегодня число?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat inputDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = inputDateFormat.parse(bufferedReader.readLine());
        SimpleDateFormat outputDateFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(outputDateFormat.format(date).toUpperCase());

    }
}
