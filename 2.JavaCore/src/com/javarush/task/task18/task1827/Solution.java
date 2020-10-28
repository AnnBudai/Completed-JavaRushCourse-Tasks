package com.javarush.task.task18.task1827;

/*
Прайсы
*/

import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String filename = in.readLine();
        in.close();
        if (args.length != 0 && args[0].equals("-c")) {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            int mId = 0;

            while (reader.ready()) {
                int id = Integer.parseInt(reader.readLine().substring(0, 8).trim());
                if (id > mId) {
                    mId = id;
                }
            }
            reader.close();

            BufferedWriter wrtr = new BufferedWriter(new FileWriter(filename, true));
            wrtr.newLine();
            wrtr.write(String.format("%-8.8s%-30.30s%-8.8s%-4.4s", mId + 1, args[1], args[2], args[3]));
            wrtr.flush();
            wrtr.close();
        }
    }
}