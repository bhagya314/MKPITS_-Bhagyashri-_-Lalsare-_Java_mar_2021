//WAP TO PRINT NO. FROM 50 TO 30 USING DO WHILE LOOP

package com.mkpits.java.clanguage;
import java.util.*;
public class No50To30ByDoWhileLoop
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int cnt = 50;
        do{
            System.out.println( +cnt);
            cnt--;
        }
        while(cnt>=30);
    }
}
