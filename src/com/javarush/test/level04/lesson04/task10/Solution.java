package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstNum = checkStringToInt(reader.readLine());
        int secondNum = checkStringToInt(reader.readLine());
        int thirdNum = checkStringToInt(reader.readLine());
        getResult(firstNum,secondNum,thirdNum);

    }

    public static void getResult(int a, int b, int c){

        if((a==b)&(b==c)){
            System.out.println(a+" "+b+" "+c);
        }else if(a==b & a!=c){
            System.out.println(a+" "+b);
        }else if(a==c & b!=c){
            System.out.println(a+" "+c);
        }else if(b==c & a!=c){
            System.out.println(b+" "+c);
        }else{
        }
    }
    public static int checkStringToInt(String s){
        int i = 0;
        try {
            i = Integer.parseInt(s);
            return (i);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки! Ты говно!");
            return (i);

        }
    }

}