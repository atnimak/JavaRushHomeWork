package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        positiveNumber(Integer.parseInt(reader.readLine()));

    }

    public static void positiveNumber(int myint)
    {
        if (myint>0){
            myint=myint*2;
            System.out.println(myint);
        }else if (myint<0){
            myint++;
            System.out.println(myint);
        }else{
            System.out.print(myint);
        }

    }

}
/*
package com.javarush.test.level04.lesson04.task05;

// число
//Ввести с клавиатуры число. Если число четное, то увеличить его в два раза. Если число нечетное, то прибавить единицу.
//Вывести результат на экран.


import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        positiveNumber(Integer.parseInt(reader.readLine()));

    }

    public static void positiveNumber(int myint)
    {
        if ((myint%2)==0){
            myint=myint*2;
            System.out.println(myint);
        }else{
            myint++;
            System.out.println(myint);
        }

    }

}
*/
