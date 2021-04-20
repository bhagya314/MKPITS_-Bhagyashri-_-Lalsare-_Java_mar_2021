package com.mkpits.java.clanguage;
import java.util.*;
public class PalindromeNo
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int n,origno,revno=0,rem;
        System.out.println("enter number");
        n= sc.nextInt();
        origno=n;
        while(n!=0)
        {
            rem = n % 10;
            revno = revno * 10 + rem;
            n/= 10;
        }if(origno==revno)

        System.out.println("entered number is palindrome. " + origno);
    else
        System.out.println("Entered number is not palindrome. " + origno);

    }
}
