package com.javarush.test.level14.lesson06.home01;


public class UkrainianHen extends Hen
{
    public int getCountOfEggsPerMonth()
    {
        return 200;
    }
    String getDescription()
    {
        return super.getDescription()+" Моя страна - "+ Country.UKRAINE +". Я несу " +getCountOfEggsPerMonth()+ " яиц в месяц.";
    }
}
