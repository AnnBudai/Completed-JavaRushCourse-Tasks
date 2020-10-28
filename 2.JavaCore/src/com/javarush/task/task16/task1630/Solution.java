package com.javarush.task.task16.task1630;

import java.io.*;

/* 
Последовательный вывод файлов
*/

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            firstFileName = bufferedReader.readLine();
            secondFileName = bufferedReader.readLine();
        } catch (IOException e) {
            System.out.println("IOExceptions has occurred in static block when there are file names inputs");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fileName;
        private String fileContent = "";

        @Override
        public void run() {
            String fileContent = "";
            try {
                BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
                while (reader.ready()) {
                    fileContent += reader.readLine() + " ";
                }
                reader.close();
            } catch (FileNotFoundException fileNotFoundException) {
                System.out.println("FileNotFoundException has occurred in ReadFileThread when there is getFileContent method in " + this.getName());
            } catch (IOException e) {
                System.out.println("IOException has occurred in ReadFileThread when there is getFileContent method in " + this.getName());
            }
            this.fileContent = fileContent;
        }

        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            return fileContent;
        }
    }
}
