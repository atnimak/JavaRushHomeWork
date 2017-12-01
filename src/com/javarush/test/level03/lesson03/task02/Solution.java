package com.javarush.test.level03.lesson03.task02;

/* Конвертер валют
Реализуйте метод convertEurToUsd, переводящий евро в доллары по заданному курсу.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс
*/
public class Solution
{
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(5,1.5));
        System.out.println(convertEurToUsd(9,0.7));
    }

    public static double convertEurToUsd(int eur, double course){
        double usdUsa = (eur*course);
        return(usdUsa);
    }
}
