package com.javarush.task.task14.task1414;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
MovieFactory
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Set<String> keysSet = new HashSet<>(Arrays.asList("cartoon", "thriller", "soapOpera"));
        String string;
        do {
            string = bufferedReader.readLine();
            Movie movie = MovieFactory.getMovie(string);
            try {
                System.out.println(movie.getClass().getSimpleName());
            } catch (NullPointerException nullPointerException) {

            }
        } while (keysSet.contains(string));

        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            } else if ("cartoon".equals(key)) {
                movie = new Cartoon();
            } else if ("thriller".equals(key)) {
                movie = new Thriller();
            }
            return movie;
        }
    }

    static abstract class Movie {
    }

    static class Cartoon extends Movie {

    }

    static class Thriller extends Movie {

    }

    static class SoapOpera extends Movie {
    }
}
