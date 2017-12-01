package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
       /* String date = "JANUARY 2 2020";
        System.out.println(isDateOdd(date));*/
    }

    public static boolean isDateOdd(String date)
    {
        Date yearStarTime = new Date();
        yearStarTime.setHours(0);
        yearStarTime.setMinutes(0);
        yearStarTime.setSeconds(0);
        yearStarTime.setDate(1); // первое число
        yearStarTime.setMonth(0); // месяц январь, нумерация для месяцев 0-11

        Date currentDate = new Date(date);
        long msTimeDistance = currentDate.getTime() - yearStarTime.getTime();
        long msDay = 24*60*60*1000; //сколько миллисекунд в одних сутках
        int dayCount = (int) (msTimeDistance/msDay); //количество целых дней
        if (dayCount%2==0){
            return false;
        }else{
            return true;
        }
    }
}
