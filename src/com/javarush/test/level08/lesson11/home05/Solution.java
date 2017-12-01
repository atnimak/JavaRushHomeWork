package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println(stringFirstCharToUpperCase(s));


    }

    private static String stringFirstCharToUpperCase(String s){
        char[] chars = s.toCharArray();
        String result = new String();
        for(int i = 0;i<chars.length;i++){
            if(i==0&&chars[i]!=' ') {
                result = ""+Character.toUpperCase(chars[0]);
            } else if(chars[i]==' '){
                if(i!=chars.length-1&&chars[i+1]!=' '){
                    result+=" "+Character.toUpperCase(chars[i+1]);
                }else if(chars[i] == ' '){
                    result+=" ";
                }


            }else if(chars[i-1]!=' '){
                result+=""+chars[i];

            }

        }
        return result;
    }


}
