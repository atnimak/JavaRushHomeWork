package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        ArrayList<String>[] arrayOfStringList =  new ArrayList[3];
        ArrayList<String> list1 = new ArrayList<>();

        for(int i = 0;i<10;i++){
            list1.add("Первый лист, строка № "+ i);
        }

        ArrayList<String> list2 = new ArrayList<>();

        for(int i = 0;i<10;i++){
            list2.add("Второй лист, строка № "+ i);
        }
        ArrayList<String> list3 = new ArrayList<>();

        for(int i = 0;i<10;i++){
            list3.add("Третий лист, строка № "+ i);
        }

        arrayOfStringList[0] = list1;
        arrayOfStringList[1] = list2;
        arrayOfStringList[2] = list3;

        return arrayOfStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}