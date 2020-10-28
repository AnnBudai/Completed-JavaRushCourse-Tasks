package com.javarush.task.task14.task1408;

public class RussianHen extends Hen {
    public final String country = "Russia";

    @Override
    public int getCountOfEggsPerMonth() {
        return 100;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
