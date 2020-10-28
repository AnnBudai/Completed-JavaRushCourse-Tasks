package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen{
    public final String country = "Belarus";

    @Override
    public int getCountOfEggsPerMonth() {
        return 130;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
