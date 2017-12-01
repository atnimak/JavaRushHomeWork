package com.javarush.test.level07.lesson09.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Считать строки с консоли и объявить ArrayList list тут
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0;i<10;i++){
            list.add(reader.readLine());
        }
        /*list.add("роза"); //0
        list.add("лира"); //1
        list.add("лоза"); //2
        list.add("коза"); //3
        list.add("рохля"); //4
        list.add("ватрушка"); //5
        list.add("копуша"); //6
        list.add("говяша"); //7
        list.add("маша"); //8
        list.add("овес"); //9*/

        ArrayList<String> result = doubleValues(list);

        for(int i = 0;i<result.size();i++){
            System.out.println(result.get(i));
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list)
    {
        for(int i=0;i<list.size();){
            list.add(i+1,list.get(i));
            i=i+2;
        }
        return list;
    }
}
