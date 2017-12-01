package com.javarush.test.level08.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = reader.readLine();
        }

       /* array[0] = "Алкоголь";
        array[1] = "Морковь";
        array[2] = "Калина";
        array[3] = "Барбарис";
        array[4] = "Говно";
        array[5] = "Кариес";
        array[6] = "Ветчина";
        array[7] = "Воскресение";
        array[8] = "Кобура";
        array[9] = "Вольга";
        array[10] = "Саша";
        array[11] = "Кино";
        array[12] = "Капучино";
        array[13] = "Лизон";
        array[14] = "Левон";
        array[15] = "Сук";
        array[16] = "Абракадабра";
        array[17] = "Аватар";
        array[18] = "Яблоко";
        array[19] = "Щука";*/

        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (isGreaterThan(array[j],array[j+1])) {
                    String t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b)
    {
        return a.compareTo(b) > 0;
    }
}
