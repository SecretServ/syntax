package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static int fin = 0;
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();

        final int a = Integer.parseInt(s1);
        final int b = Integer.parseInt(s2);
        final int c = Integer.parseInt(s3);

        int m = maxim(maxim(a, b), c);



//if-else big block//
        if (m == a){
            if (b > c){
                fin = b;
            } else {
                fin = c;
            }
        } else if (m == b){
            if (a > c){
                fin = a;
            } else {
                fin = c;
            }
        } else if (m == c){
            if (a > b){
                fin = a;
            } else {
                fin = b;
            }
        }

        System.out.println(fin);


}

    static int maxim(int x, int y) {
        int fin = 0;

        if (x > y) {
            fin = x;
        } else {
            fin = y;
        }
        return fin;
        //напишите тут ваш код
    }
}
