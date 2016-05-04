package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

import java.io.*;
import java.nio.Buffer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader (new InputStreamReader(System.in));

        File f=new File(reader.readLine());

        BufferedReader fin=new BufferedReader(new FileReader(f));

        String line;
        while ((line = fin.readLine())!=null) System.out.println(line);
        reader.close();
        fin.close();
    }
}

