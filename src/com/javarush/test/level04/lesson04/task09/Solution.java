package com.javarush.test.level04.lesson04.task09;

/* Светофор
Работа светофора для пешеходов запрограммирована следующим образом: в начале каждого часа в течение трех минут горит зеленый сигнал,
затем в течение одной минуты — желтый, а потом в течение одной минуты — красный, затем опять зеленый горит три минуты и т. д.
Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
Определить, сигнал какого цвета горит для пешеходов в этот момент.
Результат вывести на экран в следующем виде:
"зеленый" - если горит зеленый цвет, "желтый" - если горит желтый цвет, "красный" - если горит красный цвет.
Пример для числа 2.5:
зеленый
Пример для числа 3:
желтый
Пример для числа 4:
красный
Пример для числа 5:
зеленый
*/
import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        getPrint(getTime(checkStringToDouble(reader.readLine())));


    }
    public static void getPrint(String s){
        System.out.println(s);
    }
    public static String getTime(double t){
        String result = "традиционно тут пусто пока";
        if((t>60)||(t<0)||(t==0)){
            result = "Утебя слишком длинные часы..или короткие!";
        }else{
            if ((t % 5 > 0) && (t % 5 < 3)){
                result ="зеленый";
            } else{
                if ((t % 5 >= 3) && (t % 5 < 4)){
                    result ="желтый";
                } else{
                    result ="красный";
                }
            }
        }
        return result;
    }
    public static double checkStringToDouble(String s){
        double d = 0;
        try {
            d = Double.parseDouble(s);
            return (d);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки! Ты говно!");
            return (d);

        }
    }

}

/*//Как все было бы если бы нужно было испльзовать цикл.
import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(boolean conf = true; conf == true; conf = Boolean.parseBoolean(reader.readLine())){
        getPrint(getTime(checkStringToDouble(reader.readLine())));
    }

    }
    public static void getPrint(String s){
   System.out.println(s);
    }
    public static String getTime(double t){
       String result = "традиционно тут пусто пока";
        if((t>60)||(t<0)||(t==0)){
            result = "Утебя слишком длинные часы..или короткие!";
       }else{
           if ((t % 5 > 0) && (t % 5 < 3)){
               result ="зеленый";
           } else{
               if ((t % 5 >= 3) && (t % 5 < 4)){
                  result ="желтый";
               } else{
                   result ="красный";
               }
           }
       }
        return result;
    }
    public static double checkStringToDouble(String s){
    double d = 0;
    try {
        d = Double.parseDouble(s);
        return (d);
    } catch (NumberFormatException e) {
        System.err.println("Неверный формат строки! Ты говно!");
        return (d);

    }
    }

}*/
