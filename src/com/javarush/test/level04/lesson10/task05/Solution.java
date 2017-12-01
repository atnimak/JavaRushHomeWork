package com.javarush.test.level04.lesson10.task05;

import java.io.*;

/* Таблица умножения
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
...
*/

//И охуенное мое решение.

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        int horizontal = 1;
        int vertical = 1;
        int maxHorizontal = 10;
        int maxVertical = 10;

        while(vertical<=maxVertical)
        {
            while (horizontal <= maxHorizontal)
            {
                System.out.print(horizontal * vertical + " ");
                horizontal++;
            }
            horizontal = 1;
            vertical++;

            System.out.println("");
        }



    }
}

/*
\\ Чужое хорошее решение:
        int x = 1;
        int y = 1;
        int i = 0;
        int k = 0;
        while (k < 10)
        {
            while (i < 10)
            {
                System.out.print(x * y + " ");
                y++;
                i++;
            }
            i=0; //это, кстати, моя доработка, без нее не работало
            y = 1;
            x++;
            System.out.println(" ");
            k++;
        }
*/
/*

  \\ Рабочее решение через for:
    int x = 1;
    int y = 1;
    int k = 0;
while (k < 10)
        {
        for (int i = 0; i < 10; i++)
        {
        System.out.print(x * y + " ");
        y++;
        }
        y = 1;
        x++;
        System.out.println(" ");
        k++;
        }
*/

/*
        //Мое идиотское решение.
        int i = 1;
        while (i<11){
            if (i==1){
                System.out.println(" 1 "+" 2 "+" 3 "+" 4 "+" 5 "+" 6 "+" 7 "+" 8 "+" 9 "+"10");
                i++;
            }else if(i==2){
                System.out.println(" 2 "+" 4 "+" 6 "+" 8 "+"10 "+"12 "+"14 "+"16 "+"18 "+"20");
                i++;
            }else if(i==3){
                System.out.println(" 3 "+" 6 "+" 9 "+"12 "+"15 "+"18 "+"21 "+"24 "+"27 "+"30");
                i++;
            }else if(i==4){
                System.out.println(" 4 "+" 8 "+"12 "+"16 "+"20 "+"24 "+"28 "+"32 "+"36 "+"40");
                i++;
            }else if(i==5){
                System.out.println(" 5 "+"10 "+"15 "+"20 "+"25 "+"30 "+"35 "+"40 "+"45 "+"50");
                i++;
            }else if(i==6){
                System.out.println(" 6 "+"12 "+"18 "+"24 "+"30 "+"36 "+"42 "+"48 "+"54 "+"60");
                i++;
            }else if(i==7){
                System.out.println(" 7 "+"14 "+"21 "+"28 "+"35 "+"42 "+"49 "+"56 "+"63 "+"70");
                i++;
            }else if(i==8){
                System.out.println(" 8 "+"16 "+"24 "+"32 "+"40 "+"48 "+"56 "+"64 "+"72 "+"80");
                i++;
            }else if(i==9){
                System.out.println(" 9 "+"18 "+"27 "+"36 "+"45 "+"54 "+"63 "+"72 "+"81 "+"90");
                i++;
            }else if(i==10){
                System.out.println("10 "+"20 "+"30 "+"40 "+"50 "+"60 "+"70 "+"80 "+"90 "+"100");
                i++;
            }else{
                System.out.println("Защита от дурака");
            }
        }*/