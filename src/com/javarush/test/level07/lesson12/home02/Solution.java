package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());


        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0;i<n;i++){
            list.add(reader.readLine());
        }

       /* list.add("роза"); //0
        list.add("лира"); //1
        list.add("лоза"); //2
        list.add("коза"); //3
        list.add("рохля"); //4
        list.add("ватрушка"); //5
        list.add("копуша"); //6
        list.add("говяша"); //7
        list.add("маша"); //8
        list.add("овес"); //9*/

        for(int i = 0; i<m;i++){
            String s = list.get(0);
            list.add(s);
            list.remove(0);

        }

        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
