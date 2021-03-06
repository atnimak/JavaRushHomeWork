package com.javarush.test.level04.lesson04.task08;

/* Треугольник
Ввести с клавиатуры три числа а, b, c – стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам. Результат вывести на экран в следующем виде:
"Треугольник существует." - если треугольник с такими сторонами существует.
"Треугольник не существует." - если треугольник с такими сторонами не существует.
Подсказка: Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше суммы двух других, то треугольника с такими сторонами не существует.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        doPrint(isTriangle((Integer.parseInt(reader.readLine())),(Integer.parseInt(reader.readLine())),(Integer.parseInt(reader.readLine()))));
    }
    public static void doPrint(String s){
        System.out.println(s);

    }

    public static String isTriangle(int firstSide, int secondSide, int thirdSide){
        String theTriangle;
        if (((firstSide+secondSide)>thirdSide)&&((firstSide+thirdSide)>secondSide)&&((secondSide+thirdSide)>firstSide)){
            theTriangle = "Треугольник существует.";
        }else{
            theTriangle = "Треугольник не существует.";
        }
        return theTriangle;
    }
}