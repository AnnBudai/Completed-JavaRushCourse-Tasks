package com.javarush.task.task18.task1824;

import java.io.*;

/* 
Файлы и исключения
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String fileName = in.readLine();
            try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                break;
            }
        }
        in.close();
    }
}
