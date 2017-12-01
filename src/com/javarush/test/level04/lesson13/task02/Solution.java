package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int vertical = Integer.parseInt(reader.readLine());
        int horizontal = Integer.parseInt(reader.readLine());

       for(int i1 = 1;i1<=vertical;i1++)
       {
           for (int i = 1; i <= horizontal; i++)
           {
               System.out.print(8);
               if (i==horizontal){
                   System.out.println("");// в кавычка ничего и нету, нужно для того, чтобы переносилась строка.
                   break;
               }

           }
       }
    }
}
