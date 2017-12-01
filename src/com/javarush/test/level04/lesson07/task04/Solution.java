package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        getNumbers(Integer.parseInt(reader.readLine()),Integer.parseInt(reader.readLine()),Integer.parseInt(reader.readLine()));
    }
    private static void getNumbers(int a, int b, int c){
        int positive = 0;
        int negative = 0;
        if (c>0){positive++;}
        if (c<0){negative++;}
        if (a>0){positive++;}
        if (a<0){negative++;}
        if (b>0){positive++;}
        if (b<0){negative++;}
        System.out.println("количество отрицательных чисел: "+ negative);
        System.out.println("количество положительных чисел: "+ positive);
    }
}
