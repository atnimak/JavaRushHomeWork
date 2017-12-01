package com.javarush.test.level04.lesson07.task01;

/* Строка - описание
Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
«отрицательное четное число» - если число отрицательное и четное,
«отрицательное нечетное число» - если число отрицательное и нечетное,
«нулевое число» - если число равно 0,
«положительное четное число» - если число положительное и четное,
«положительное нечетное число» - если число положительное и нечетное.
Пример для числа 100:
положительное четное число
Пример для числа -51:
отрицательное нечетное число
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        System.out.println(getDescriotion(Integer.parseInt(reader.readLine())));
    }

    private static String getDescriotion(int i){
        if((i<0)&&(i%2==0)){
            return "отрицательное четное число";
        }else if((i<0)&&(i%2!=0)){
            return "отрицательное нечетное число";
        }else if(i==0){
            return "нулевое число";
        }else if((i>0)&&(i%2==0)){
            return "положительное четное число";
        }else if((i>0)&&(i%2!=0)){
            return "положительное нечетное число";
        }else{
            return "Что-то наебнулось";

        }
    }
}
