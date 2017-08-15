package com.javarush.task.task03.task0316;

/* 
Экранирование символов
Экранирование символов
Про экранирование символов в Java читай в дополнительном материале к лекции.

Вывести на экран следующий текст — две строки:
It's Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
It's Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"
*/

import static jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java;

public class Solution {
    public static void main(String[] args) {

        System.out.println("It\'s Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"");
        System.out.println("It\'s Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"");
        //напишите тут ваш код
    }
}
