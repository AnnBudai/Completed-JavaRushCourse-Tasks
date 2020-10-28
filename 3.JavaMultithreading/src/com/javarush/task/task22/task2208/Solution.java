package com.javarush.task.task22.task2208;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
        String input = "";
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            input = bufferedReader.readLine();
        } catch (IOException e) {
            System.out.println("Exception occurred when there is string input");
        }
        input = input.trim();
        if (input.length() != 0) {
            ArrayList<String> params = new ArrayList<>(Arrays.asList(input.substring(1, input.length() - 1).split(", ")));

            Map<String, String> mapParams = new LinkedHashMap<>();
            for (String string : params) {
                mapParams.put(string.split("=")[0], string.split("=")[1]);
            }

            System.out.println(getQuery(mapParams));
        }
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Map.Entry<String, String> entry : params.entrySet()) {
            String field = entry.getKey();
            String value = entry.getValue();
            if (!value.equals("null")) {
                stringBuilder.append(String.format("%s = '%s' and ", field, value));
            }
        }
        String output = stringBuilder.toString().trim();
        if (output.endsWith("and")) {
            output = output.substring(0, output.lastIndexOf("and")).trim();
        }
        return output;
    }
}
