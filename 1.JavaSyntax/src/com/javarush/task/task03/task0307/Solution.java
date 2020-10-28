package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg zerg_name_1 = new Zerg();
        zerg_name_1.name = "1";
        Zerg zerg_name_2 = new Zerg();
        zerg_name_2.name = "2";
        Zerg zerg_name_3 = new Zerg();
        zerg_name_3.name = "3";
        Zerg zerg_name_4 = new Zerg();
        zerg_name_4.name = "4";
        Zerg zerg_name_5 = new Zerg();
        zerg_name_5.name = "5";

        Protoss protoss_name_1 = new Protoss();
        protoss_name_1.name = "1";
        Protoss protoss_name_2 = new Protoss();
        protoss_name_2.name = "2";
        Protoss protoss_name_3 = new Protoss();
        protoss_name_3.name = "3";

        Terran terran_name_1 = new Terran();
        terran_name_1.name = "1";
        Terran terran_name_2 = new Terran();
        terran_name_2.name = "2";
        Terran terran_name_3 = new Terran();
        terran_name_3.name = "3";
        Terran terran_name_4 = new Terran();
        terran_name_4.name = "4";

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
