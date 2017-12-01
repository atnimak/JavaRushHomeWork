package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

//import java.io.*;
import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //OutputStream outputStream = new FileOutputStream("d:/result.txt");
        String filename;
        filename = reader.readLine();
        FileWriter filewriter = new FileWriter(filename,false);

        String stop = "exit";
       // "d:\\result.txt"
        String data;
        ArrayList<String> list = new ArrayList<>();




        do{
            data = reader.readLine();
            list.add(data);

        }while(!(data.equals(stop)));


        for(int i = 0;i<list.size();i++){
            //System.out.println(list.get(i));
            String s = list.get(i);
            filewriter.write(s);
            filewriter.append('\n');
           // filewriter.append('E');

            filewriter.flush();

        }




    }
}
