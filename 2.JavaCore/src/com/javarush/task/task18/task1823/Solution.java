package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<>();

    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        for (String fileName = in.readLine(); !fileName.equals("exit"); fileName = in.readLine()) {
            ReadThread readThread = new ReadThread(fileName);
            readThread.start();
            readThread.join();
        }
        in.close();
    }

    public static class ReadThread extends Thread {
        private final String fileName;
        ArrayList<Integer> list = new ArrayList<>();

        public ReadThread(String fileName) throws IOException {
            this.fileName = fileName;
            FileInputStream inputStream = new FileInputStream(fileName);
            while (inputStream.available() > 0) {
                list.add(inputStream.read());
            }
            inputStream.close();
        }

        @Override
        public void run() {
            int element = list.get(0);
            for (Integer x : list) {
                if (Collections.frequency(list, x) > Collections.frequency(list, element)) {
                    element = x;
                }
                resultMap.put(fileName, element);
            }
        }

    }
}