package com.javarush.test.level07.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        //int[] array = {11,25,34,14,65,96,17,8,90,100,41,52,23,14,55,16,27,38,9,20};
        for (int i = 0; i < 20; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(int[] array)
    {
        int a,b,tmp;
        for(a=1;a<array.length;a++){
            for(b=array.length-1;b>=a;b--){
                if (array[b-1]<array[b])
                {
                    tmp = array[b];
                    array[b] = array[b-1];
                    array[b-1] = tmp;

                }

            }
        }
    }
}
