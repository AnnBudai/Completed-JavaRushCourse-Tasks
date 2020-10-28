package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen {
    public final String country = "Moldova";

    @Override
    public int getCountOfEggsPerMonth() {
        return 120;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
