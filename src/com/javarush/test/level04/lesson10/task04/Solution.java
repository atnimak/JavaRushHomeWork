package com.javarush.test.level04.lesson10.task04;

import java.io.*;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        //(((bukv+1)%10)==0) - от так выглядело условие if изначально
        String s = "S";
        int stolb=1;
        int bukv=0;
        int stringLength = 10;
        int stolbCount = 10;

        while(stolb<(stolbCount+1)) {
            bukv=0;
            while (true)
            {
                System.out.print(s);
                bukv++;
                if ((bukv+1)==stringLength) {
                    System.out.println(s);
                    break;
                }
            }
            stolb++;
        }
    }

}
