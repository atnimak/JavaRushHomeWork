package com.javarush.test.level08.lesson08.task04;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Coppola", new Date("JULY 1 1968"));
        map.put("Ivanov", new Date("AUGUST 1 1557"));
        map.put("Petrov", new Date("SEPTEMBER 1 1358"));
        map.put("Sidorov", new Date("OCTOBER 1 1999"));
        map.put("Umnov", new Date("NOVEMBER 1 1985"));
        map.put("Potter", new Date("MARCH 1 1964"));
        map.put("Wisley", new Date("APRIL 1 1923"));
        map.put("Grainger", new Date("MAY 1 1956"));
        map.put("Longbottom", new Date("DECEMBER 1 1948"));


        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        ArrayList<String> keys = new ArrayList<String>();
        for (Map.Entry<String, Date> pair : map.entrySet()){
            if (pair.getValue().getMonth() >= 5 && pair.getValue().getMonth() <= 7){
                keys.add(pair.getKey());
            }

        }

        for (int i = 0; i<keys.size(); i++ ){
            map.remove(keys.get(i));

        }
        System.out.println(map);

    }

    public static void main(String[] args) {
        System.out.println(createMap());
        removeAllSummerPeople(createMap());


    }
}
