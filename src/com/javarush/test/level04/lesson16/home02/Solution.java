package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOne = Integer.parseInt(reader.readLine());
        int numberTwo = Integer.parseInt(reader.readLine());
        int numberThree = Integer.parseInt(reader.readLine());
        if (((numberOne>numberTwo)&&(numberOne<numberThree))||((numberOne<numberTwo)&&(numberOne>numberThree))){
            System.out.println(numberOne);
        }else if(((numberTwo>numberOne)&&(numberTwo<numberThree))||((numberOne>numberTwo)&&(numberTwo>numberThree))){
            System.out.println(numberTwo);
        }else if(((numberOne>numberThree)&&(numberTwo<numberThree))||((numberOne<numberThree)&&(numberTwo>numberThree))) {
            System.out.println(numberThree);
        }else{
            System.out.println("Че-то наебнулось");
        }
    }
}
