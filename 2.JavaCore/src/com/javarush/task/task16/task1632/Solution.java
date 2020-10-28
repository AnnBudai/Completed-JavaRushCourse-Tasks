package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/*
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());

    }

    public static void main(String[] args) {
    }

    public static class Thread1 extends Thread {

        @Override
        public void run() {
            while (true) {
            }
        }
    }


    public static class Thread2 extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class Thread3 extends Thread {
        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }

        }
    }

    public static class Thread4 extends Thread implements Message {
        @Override
        public void showWarning() {
            this.interrupt();
        }

        @Override
        public void run() {
            while (!this.isInterrupted()) {

            }
        }
    }

    public static class Thread5 extends Thread {

        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;
            try {
                while (!this.isInterrupted()) {
                    String line = reader.readLine();
                    if (line.equals("N")) {
                        this.interrupt();
                    } else {
                        sum += Integer.parseInt(line);
                    }
                }
            } catch (IOException e) {
                System.out.println("IOExceptions has occured in Thread5");
            }
            System.out.println(sum);
        }
    }
}