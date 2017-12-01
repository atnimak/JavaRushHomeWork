package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int minLength = 2147483647, stringLength = 0;
        String tmpString = "";


        for (int i = 0; i < 5; i++)
        {
            list.add(reader.readLine());
        }

        for (int i = 0; i < list.size(); i++)
        {
            stringLength = list.get(i).length();
            if (stringLength < minLength)
            {
                minLength = stringLength;
            }
        }

        for (int i = 0; i < list.size(); i++)
        {
            stringLength = list.get(i).length();
            if (stringLength == minLength)
            {
                tmpString = list.get(i);
                System.out.println(tmpString);
            }
        }
    }
}
