package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] bigS = new String[20];
        String[] minS1 = new String[10];
        String[] minS2 = new String[10];
        for (int i = 0;i<bigS.length;i++){
            bigS[i] = reader.readLine();
        }

        for (int i = 0; i<minS1.length;i++){
            minS1[i] = bigS[i];
        }

        for (int i = 0; i<minS1.length;i++){
            minS2[i] = bigS[i+10];
        }

        /*for (int i = 0; i<minS2.length;i++){
            System.out.println(minS1[i]);
        }*/
        for (int i = 0; i<minS2.length;i++){
            System.out.println(minS2[i]);
        }


    }
}
