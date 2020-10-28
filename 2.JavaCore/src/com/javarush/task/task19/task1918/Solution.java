package com.javarush.task.task19.task1918;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.util.ArrayList;

/* 
Знакомство с тегами
*/

public class Solution {
    public static void main(String[] args) {

        String fileName = null;

        try (BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = consoleReader.readLine();
        } catch (IOException ignore) {
            /*NOP*/
        }

        StringBuilder readFileContent = new StringBuilder();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while (fileReader.ready()) {
                readFileContent = readFileContent.append(fileReader.readLine());
            }
        } catch (IOException ignore) {
            /*NOP*/
        }

        String fileContent = readFileContent.toString().replaceAll("\r\n", "");

        String openTag = "<" + args[0];
        String closingTag = "</" + args[0];
        int tagLength = args[0].length();
        int startTagIndex = 0;
        int endTagIndex = 0;

        ArrayList<String> tags = new ArrayList<>();

        while ((startTagIndex != -1) && (startTagIndex < fileContent.length())) {
            startTagIndex = fileContent.indexOf(openTag, startTagIndex);
            endTagIndex = fileContent.indexOf(closingTag, startTagIndex + tagLength);

            int indexInTag = startTagIndex + tagLength;
            if (endTagIndex != -1) {
                while (fileContent.substring(indexInTag, endTagIndex).contains(openTag)) {
                    indexInTag = endTagIndex + tagLength;
                    endTagIndex = fileContent.indexOf(closingTag, indexInTag);
                }
            }
            if (startTagIndex != -1 && endTagIndex != -1) {
                tags.add(fileContent.substring(startTagIndex, endTagIndex + tagLength + 3));
                startTagIndex += tagLength;
            }
        }

        for (String tag : tags) {
            System.out.println(tag);
        }
    }

/**
 * Solution with using JSOUP
 *
 * public static void main(String[] args) throws IOException {
 * BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
 * BufferedReader fileReader = new BufferedReader(new FileReader(bufferedReader.readLine().trim()));
 * bufferedReader.close();
 * StringBuilder stringBuilder = new StringBuilder();
 * while (fileReader.ready()) {
 * stringBuilder.append(fileReader.readLine());
 * }
 * fileReader.close();
 * String html = stringBuilder.toString();
 * Document document = Jsoup.parse(html);
 * Elements paragraphs = document.getElementsByTag(args[0]);
 * for (Element paragraph : paragraphs) {
 * String line = paragraph.toString().trim();
 * String[] words = line.split("<.+?>");
 * String replacedString = "";
 * for (String word : words) {
 * if (word.trim().length() > 0) {
 * replacedString = word;
 * }
 * }
 * line = line.replace(replacedString, replacedString.trim());
 * System.out.println(line);
 * }
 */

}

