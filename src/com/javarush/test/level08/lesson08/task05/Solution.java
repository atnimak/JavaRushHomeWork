package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
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
        map.put("Gavrilenko","Olga");
        map.put("Bolenko","Olga");
        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
            HashSet<String> list = new HashSet<String>();
            Iterator<Map.Entry<String, String>> iterator1 = map.entrySet().iterator();

            for(Map.Entry<String, String> s1 : map.entrySet()){
                int count = 0;
                for (Map.Entry<String, String> s2 : map.entrySet())
                {
                    if (s1.getValue().equals(s2.getValue())) count++;
                }
                if(count > 1) list.add(iterator1.next().getKey());
            }
            for(String s : list){
                removeItemFromMapByValue(map,s);
            }


    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        map.remove(value);
    }


    public static void main(String[] args) {
        HashMap map = createMap();
        System.out.println(map);
        removeTheFirstNameDuplicates(map);
        System.out.println(map);



    }

}
