package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maxLength=0, stringLength=0;
        String tmpString = "";


        for(int i=0;i<5;i++){
            list.add(reader.readLine());
        }

        for(int i = 0;i<list.size();i++) {
            stringLength = list.get(i).length();
            if (stringLength > maxLength) {
                maxLength = stringLength;
            }
        }

        for(int i=0;i<list.size();i++){
            stringLength = list.get(i).length();
            if (stringLength == maxLength) {
                tmpString = list.get(i);
                System.out.println(tmpString);
            }
        }

     /*
     //Невероятно крутое неработающее решение.

      ArrayList<String> ourString=new ArrayList<String>();
       ourString.add("");

      for(int i = 0;i<list.size();i++){
            stringLength = list.get(i).length();
            if(stringLength>=maxLength){
                maxLength=stringLength;
                tmpString = list.get(i);
                if(ourString.get(0).length()<tmpString.length()){
                    for(int i1 = 0;i1<ourString.size();i1++){
                        ourString.remove(i1);
                    }
                    ourString.add(tmpString);
                }else if(ourString.get(0).length()==tmpString.length()){
                    ourString.add(tmpString);
                }
            }

        }


        for (int i=0; i<ourString.size();i++){
            System.out.println(ourString.get(i));
        }
*/


    }
}
