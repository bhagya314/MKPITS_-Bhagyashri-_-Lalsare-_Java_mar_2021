//wap to create 2 d array of 3 rows and 3 columns
//to store 9 numbers


import java.util.*;
public class ThreeRow3ColumnsTwoDArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num[][]=new int [3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println("enter number");
                num[i][j]=sc.nextInt();
            }
        }
            System.out.println("\n array elements are:\n");
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++) {
                System.out.print("\t" + num[i][j]);
            }
                System.out.println();
        }
    }
}
