package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String,String> map = new HashMap<String, String>();
        map.put("Petrov","Ivan");
        map.put("Sidorov","Petr");
        map.put("Ivanov","Sergei");
        map.put("Ivanchenko","Fedor");
        map.put("Petrenko","Kimor");
        map.put("Sidorchebko","Hutor");
        map.put("Georgienko","Masha");
        map.put("Hitrenko","Katya");
        map.put("Chernogopenko","Leila");
        map.put("Bolenko","Olga");
        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int i = 0;
        for ( String s: map.values() ) {
            if(s.equals(name)){
                i++;
            }
        }
        return i;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int i = 0;
        for ( String s: map.keySet() ) {
            if(s.equals(lastName)){
                i++;
            }
        }
        return i;

    }
}
