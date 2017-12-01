package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        getBigToMin(checkStringToInt(reader.readLine()),checkStringToInt(reader.readLine()),checkStringToInt(reader.readLine()));

    }

    private static int checkStringToInt(String s){
        int i = 0;
        try{
            i=Integer.parseInt(s);
            return i;
        }catch(NumberFormatException e){
            System.err.println("Неверный формат строки! Ты говно!");
            return (i);
        }
    }
    private static void getBigToMin(int a, int b, int c){
        if (a>b&&b>c){
            System.out.println(a+" "+b+" "+c);
        }else if(a>b&&c>b){
            System.out.println(a+" "+c+" "+b);
        }else if(b>a&&a>c){
            System.out.println(b+" "+a+" "+c);
        }else if(b>c&&c>a){
            System.out.println(b+" "+c+" "+a);
        }else if(c>a&&a>b){
            System.out.println(c+" "+a+" "+b);
        }else if(c>b&&b>a){
            System.out.println(c+" "+b+" "+a);
        }else{
            System.out.println("Есть одинаковые числа!");
        }
    }
}
