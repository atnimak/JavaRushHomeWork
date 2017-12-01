package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> arlist = new ArrayList<>();
        int[] array0 = new int[5];
        int[] array1 = new int[2];
        int[] array2 = new int[4];
        int[] array3 = new int[7];
        int[] array4 = new int[0];

        arlist.add(array0);
        arlist.add(array1);
        arlist.add(array2);
        arlist.add(array3);
        arlist.add(array4);

        for (int i = 0; i < arlist.size(); i++)
        {
            for (int j = 0; j < arlist.get(i).length; j++)
            {
                arlist.get(i)[j] = j;
            }
        }




        return arlist;


    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
