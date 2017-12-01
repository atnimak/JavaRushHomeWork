package com.javarush.test.level03.lesson08.task05;

/* Чистая любовь
Ввести с клавиатуры три имени, вывести на экран надпись:
name1 + name2 + name3 = Чистая любовь, да-да!
Пример: Вася + Ева + Анжелика = Чистая любовь, да-да!
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String nameOne = reader.readLine();
        String nameTwo = reader.readLine();
        String nameThree = reader.readLine();
        System.out.println(nameOne +" + "+ nameTwo +" + "+ nameThree + " = Чистая любовь, да-да!");



    }
}