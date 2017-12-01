package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i<20;i++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        /*for(int i = 0;i<20;i++) {
            double d = Math.random()*100;
            int in = (int) d;
            list.add(in);
        }*/
        int  maximum = -2147483648;
        int  minimum = 2147483647;

        /*for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }*/

        for(int i = 0; i<list.size();i++){
            int tmp = list.get(i);
            if(tmp>maximum){
                maximum = tmp;
            }
        }

        for(int i = 0; i<list.size();i++){
            int tmp = list.get(i);
            if(tmp<minimum){
                minimum = tmp;
            }
        }


        System.out.println(maximum);
        System.out.println(minimum);
    }
}
