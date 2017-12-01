package com.javarush.test.level10.lesson11.home09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Одинаковые слова в списке
Ввести с клавиатуры в список 20 слов. Нужно подсчитать количество одинаковых слов в списке.
Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр – уникальная строка,
а второй – число, сколько раз данная строка встречалась в списке.
Вывести содержимое словаря на экран.
В тестах регистр (большая/маленькая буква) влияет на результат.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++)
        {
            words.add(reader.readLine());
        }
        /*words.add("Один");
        words.add("Два");
        words.add("Три");
        words.add("Четыре");
        words.add("Пять");
        words.add("Шесть");
        words.add("Семь");
        words.add("Восемь");
        words.add("Девять");
        words.add("Ноль");
        words.add("Один");
        words.add("Два");
        words.add("Три");
        words.add("Четыре");
        words.add("Пять");
        words.add("Шесть");
        words.add("Семь");
        words.add("Восемь");
        words.add("Девять");
        words.add("Десять");*/

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet())
        {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list)
    {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        ArrayList<String> localwords = new ArrayList<String>();

        for(int i = 0;i<list.size();i++){
            localwords.add(list.get(i));
        }

        for(int i=0;i<list.size();i++){
            int count = 0;
            for(int i1=0;i1<localwords.size();i1++){
                if(list.get(i).equals(localwords.get(i1))){
                    count ++;
                }
            }
            result.put(list.get(i),count);
        }

        return result;
    }

}
