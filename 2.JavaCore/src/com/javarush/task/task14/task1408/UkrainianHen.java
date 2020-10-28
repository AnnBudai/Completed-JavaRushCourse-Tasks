package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {

    public final String country = "Ukraine";

    @Override
    public int getCountOfEggsPerMonth() {
        return 150;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
