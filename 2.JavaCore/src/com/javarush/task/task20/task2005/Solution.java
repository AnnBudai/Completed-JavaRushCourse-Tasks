package com.javarush.task.task20.task2005;

import java.io.*;
import java.util.*;

/*
Странные ошибки
*/
//При чтении/записи объектов типа Human возникают странные ошибки.
//Разберись в чем дело и исправь их.
public class Solution {
    public static void main(String[] args) {
        try {
            File file1 = File.createTempFile("C:\\Users\\Igor\\Desktop\\data1.txt", null);
            OutputStream outputStream = new FileOutputStream(file1);
            InputStream inputStream = new FileInputStream(file1);

            Human ivanov = new Human();
            ivanov.save(outputStream);
            outputStream.flush();
            outputStream.close();

            Human somePerson = new Human();
            somePerson.load(inputStream);

            //check here that ivanov equals to somePerson - проверьте тут, что ivanov и somePerson равны
            System.out.println(ivanov.equals(somePerson));
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (!Objects.equals(name, human.name)) return false;
            return Objects.equals(assets, human.assets);

        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        public void save(OutputStream outputStream) {
            PrintWriter printWriter = new PrintWriter(outputStream);
            if(this.name != null) {
                printWriter.println("yes");
                printWriter.println(this.name);
                printWriter.println(assets.size());

                if (this.assets.size() > 0) {
                    for (Asset current : this.assets) {
                        printWriter.println(current.getName());
                        printWriter.println(current.getPrice());
                    }
                }
            }
            else printWriter.println("no");
            printWriter.close();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String name1= reader.readLine();
            if(name1.equals("yes")){
                this.name = reader.readLine();
                int i=Integer.parseInt(reader.readLine());
                while((i--)>0) {
                    Asset asset = new Asset(reader.readLine());
                    asset.setPrice(Double.parseDouble(reader.readLine()));
                    this.assets.add(asset);
                }
            }
            else if(name1.equals("no"))
                this.name = null;
            reader.close();
        }
    }
}