package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/


import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // вводим имя файла с консоли

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        //String filename = "pom";

        //читаем содержимое файла, выбираем четные числа

        BufferedReader in = new BufferedReader(new FileReader(filename));
        ArrayList<Integer> list = new ArrayList<Integer>();
        int tmp;
        String line;
        while ((line = in.readLine()) != null) {
           // System.out.println(line);
            tmp=Integer.parseInt(line);
            if(tmp%2==0)
            list.add(tmp);
        }

        // сортируем числа
        Collections.sort(list);

        // выводим отсотированные четные числа
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }


    }
}
