package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(getDay(Integer.parseInt(reader.readLine())));

    }

    public static String getDay(int whatDay){
        String thisDay = "мне ничего не присвоили";
        if (whatDay == 1) {
            thisDay = "понедельник";
        }else if (whatDay == 2){
            thisDay = "вторник";
        }else if (whatDay == 3){
            thisDay = "среда";
        }else if (whatDay == 4){
            thisDay = "четверг";
        }else if (whatDay == 5){
            thisDay = "пятница";
        }else if (whatDay == 6){
            thisDay = "суббота";
        }else if (whatDay == 7){
            thisDay = "воскресение";
        }else if ((whatDay>7)||(whatDay<0)||(whatDay==0)){
            thisDay = "такого дня недели не существует";
        }
        return thisDay;
    }

}