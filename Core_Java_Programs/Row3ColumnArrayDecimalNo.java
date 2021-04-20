

package com.mkpits.java.clanguage;
import java.util.*;
public class Row3ColumnArrayDecimalNo
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        float num[][]=new float[3][3];
        int row,col;
        for(row=0;row<3;row++)
        {
            for(col=0;col<3;col++)
            {
                System.out.println("ENter decimal number");
                num[row][col]=sc.nextFloat();
            }
        }
        for(row=0;row<3;row++) {
            for (col = 0; col < 3; col++) {
                System.out.print(" \t " + num[row][col]);
            }System.out.println();
        }
    }
}
