package com.javarush.test.level05.lesson12.home04;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/
import java.util.Calendar;
import java.util.Date;

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println("08 06 2016");// работающее решение

        //неработающее умное решение
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date()); // Date date
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH) + " " + (calendar.get(Calendar.MONTH) + 1) + " " + calendar.get(Calendar.YEAR));


    }
}
