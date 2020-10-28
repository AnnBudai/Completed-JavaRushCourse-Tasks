package com.javarush.task.task18.task1822;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(in.readLine());
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String res;

        while ((res = bufferedReader.readLine()) != null) {
            if (res.startsWith(args[0] + " ")) {
                System.out.println(res);
                break;
            }
        }

        in.close();
        bufferedReader.close();
        bufferedReader.close();
    }
}
