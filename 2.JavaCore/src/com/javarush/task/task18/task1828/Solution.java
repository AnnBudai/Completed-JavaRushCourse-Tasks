package com.javarush.task.task18.task1828;

/*
Прайсы 2
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String filename = in.readLine();
        in.close();

        if (args.length != 0 && args[0].equals("-u")) {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            ArrayList<String> fileList = new ArrayList<>();

            while (reader.ready()) {
                fileList.add(reader.readLine());
            }
            reader.close();


            for (String s : fileList) {
                if ((s.substring(0, 8).trim()).equals(args[1])) {
                    int index = fileList.indexOf(s);
                    String str = String.format("%-8.8s%-30.30s%-8.8s%-4.4s", args[1], args[2], args[3], args[4]);
                    fileList.set(index, str);
                }
            }

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));

            for (String s : fileList) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();


        } else if (args.length != 0 && args[0].equals("-d")) {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            ArrayList<String> fileList = new ArrayList<>();

            while (reader.ready()) {
                fileList.add(reader.readLine());
            }
            reader.close();

            for (String s : fileList) {
                if ((s.substring(0, 8).trim()).equals(args[1])) {
                    fileList.remove(s);
                }
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));

            for (String s : fileList) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();

        }


    }
}