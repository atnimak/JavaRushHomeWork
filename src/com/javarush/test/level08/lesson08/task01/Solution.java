package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
       HashSet<String> set = new HashSet <String>();
        for(int i = 0;i<20;i++){
            String s = "Ловать";
            String s1 = Integer.toString(i);
            String ss1 = s+s1;
            set.add(ss1);
        }

        /*set.add("Любовь");
        set.add("Лейка");
        set.add("Локоть");
        set.add("Лавр");
        set.add("Леон");
        set.add("Лакомка");
        set.add("Лаврушка");
        set.add("Лицо");
        set.add("Лоб");
        set.add("Лимбо");
        set.add("Лес");
        set.add("Латакия");
        set.add("Лиса");
        set.add("Лось");
        set.add("Лего");
        set.add("Лавкрафт");
        set.add("Леонозово");
        set.add("Лиза");
        set.add("Ловать");*/
    return set;
    }
}
