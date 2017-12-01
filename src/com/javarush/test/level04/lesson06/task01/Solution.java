package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(getMinNumber(checkStringToInt(reader.readLine()),checkStringToInt(reader.readLine())));

    }
    public static int checkStringToInt(String s){
        int i =0;
        try {
            i = Integer.parseInt(s);
            return (i);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки! Ты говно!");
            return (i);

        }
    }
    public static int getMinNumber(int i, int i2){
        if (i<i2){
            return i;
        }else{
            return i2;
        }

    }
}