package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //напишите тут ваш код

        Map<String, Cat> catlist = new HashMap<String, Cat>();
        catlist.put("Vaska", new Cat("Vaska"));
        catlist.put("Pashka", new Cat("Pashka"));
        catlist.put("Gosha", new Cat("Gosha"));
        catlist.put("Sveta", new Cat("Sveta"));
        catlist.put("Nastya", new Cat("Nastya"));
        catlist.put("Gesha", new Cat("Gesha"));
        catlist.put("Popka", new Cat("Popka"));
        catlist.put("Vova", new Cat("Vova"));
        catlist.put("Vitya", new Cat("Vitya"));
        catlist.put("Pipka", new Cat("Pipka"));

        return catlist;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> set = new HashSet<Cat>();
        for (Map.Entry<String, Cat> pair : map.entrySet())
        {
            Cat value = pair.getValue();
            set.add(value);
        }


        return set;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat.name);
        }
    }

    public static class Cat
    {
        private  String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }

    }


}
