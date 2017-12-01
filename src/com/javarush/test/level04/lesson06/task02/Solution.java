package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(getMaxNumber(checkStringToInt(reader.readLine()),checkStringToInt(reader.readLine()),checkStringToInt(reader.readLine()),checkStringToInt(reader.readLine())));

    }
    private static int checkStringToInt(String s){
        int i = 0;
        try{
            i = Integer.parseInt(s);
            return i;
        }catch(NumberFormatException e){
            System.err.println("Неверный формат строки! Ты говно!");
            return (i);
        }

    }
    private static int getMaxNumber(int a, int b, int c, int d){
        int biggesti = 666666666;

        if (a>b&&a>c&&a>d){
            biggesti = a;
        }else if(b>a&&b>c&&b>d){
            biggesti = b;
        }else if(c>a&&c>b&&c>d){
            biggesti = c;
        }else if(d>a&&d>b&&d>c){
            biggesti = d;
        }else{
        }
        return biggesti;

        /*А можно сделать несрогие неравенства. Что позволит методу работать даже если самых больших числе несколько
        if (a>=b&&a>=c&&a>=d){
            biggesti = a;
        }else if(b>=a&&b>=c&&b>=d){
            biggesti = b;
        }else if(c>=a&&c>=b&&c>=d){
            biggesti = c;
        }else if(d>=a&&d>=b&&d>=c){
            biggesti = d;
        }else{
        }
        return biggesti;*/

    }
}
