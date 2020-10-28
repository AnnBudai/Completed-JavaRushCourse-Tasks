package com.javarush.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file_1_reader = new BufferedReader(new FileReader(bufferedReader.readLine()));
        BufferedReader file_2_reader = new BufferedReader(new FileReader(bufferedReader.readLine()));
        bufferedReader.close();

        ArrayList<String> file_1_Lines = getLinesFromFile(file_1_reader);
        ArrayList<String> file_2_Lines = getLinesFromFile(file_2_reader);

        int line_1_Pos = 0;
        int line_2_Pos = 0;
        while (line_1_Pos < file_1_Lines.size() && line_2_Pos < file_2_Lines.size()) {
            if (file_1_Lines.get(line_1_Pos).equals(file_2_Lines.get(line_2_Pos))) {
                lines.add(new LineItem(Type.SAME, file_1_Lines.get(line_1_Pos)));
                line_1_Pos++;
                line_2_Pos++;
            } else if ((line_1_Pos + 1 < file_1_Lines.size()) && (file_1_Lines.get(line_1_Pos + 1).equals(file_2_Lines.get(line_2_Pos)))) {
                lines.add(new LineItem(Type.REMOVED, file_1_Lines.get(line_1_Pos)));
                line_1_Pos++;
            } else if ((line_2_Pos + 1 < file_2_Lines.size()) && (file_2_Lines.get(line_2_Pos + 1).equals(file_1_Lines.get(line_1_Pos)))) {
                lines.add(new LineItem(Type.ADDED, file_2_Lines.get(line_2_Pos)));
                line_2_Pos++;
            }
        }

        while (line_1_Pos < file_1_Lines.size()) {
            lines.add(new LineItem(Type.REMOVED, file_1_Lines.get(line_1_Pos)));
            line_1_Pos++;
        }
        while (line_2_Pos < file_2_Lines.size()) {
            lines.add(new LineItem(Type.ADDED, file_2_Lines.get(line_2_Pos)));
            line_2_Pos++;
        }

        file_1_reader.close();
        file_2_reader.close();
    }

    private static ArrayList<String> getLinesFromFile(BufferedReader fileReader) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        while (fileReader.ready()) {
            arrayList.add(fileReader.readLine());
        }
        return arrayList;
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }

    }
}
