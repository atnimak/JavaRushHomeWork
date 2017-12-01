package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstNumber = Integer.parseInt(reader.readLine());
        int secondNumber = Integer.parseInt(reader.readLine());
        int thirdNumber = Integer.parseInt(reader.readLine());
        if ((firstNumber!=secondNumber)&(secondNumber==thirdNumber)){
            System.out.println(1);
        }else if((firstNumber!=secondNumber)&(firstNumber==thirdNumber)){
            System.out.println(2);
        }else if((thirdNumber!=secondNumber)&(secondNumber==firstNumber)){
            System.out.println(3);
        }else{

        }
    }
}
