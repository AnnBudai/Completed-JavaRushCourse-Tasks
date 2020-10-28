package com.javarush.task.task16.task1618;

/*
Снова interrupt
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        TestThread testThread = new TestThread();
        testThread.start();
        Thread.sleep(5500);
        testThread.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread {
        private volatile int number;

        @Override
        public void run() {
            try {
                while (!currentThread().isInterrupted()) {
                    System.out.println(number++);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception was catched!");
            }
        }
    }
}