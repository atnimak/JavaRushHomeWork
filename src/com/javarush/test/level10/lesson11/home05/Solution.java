package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++)
        {
            alphabet.add(abcArray[i]);
        }

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

       /* ArrayList<String> list = new ArrayList<String>();
        list.add("жопааа");
        list.add("авакуум");
        list.add("сиська");
        list.add("вокруг");
        list.add("абрикосовоеваренье");
        list.add("чебуречекиписька");
        list.add("восемь");
        list.add("говно");
        list.add("чюпачюпс");
        list.add("кировскоешоссе");*/
       // int count = 0;


        for(int i = 0;i<alphabet.size();i++){
            int count=0;
            for(int i1 = 0;i1<list.size();i1++){
                for(int i2 = 0;i2<list.get(i1).length();i2++){
                    if(alphabet.get(i).equals(list.get(i1).charAt(i2))){
                        count++;
                    }
                }
            }
            System.out.println(alphabet.get(i) +" "+ count );
        }
    }

}
