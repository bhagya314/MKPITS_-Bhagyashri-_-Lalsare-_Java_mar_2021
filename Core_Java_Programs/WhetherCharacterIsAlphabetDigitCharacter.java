//Write a C program to check whether a character is an alphabet,
//        digit or special character
package com.mkpits.java.clanguage;
import java.util.*;
public class WhetherCharacterIsAlphabetDigitCharacter
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        char ch;
        System.out.println("Enter any character\n");
        ch=sc.next().charAt(0);

        if((ch >= 'a' && ch <='z') ||(ch >= 'A' && ch <= 'Z'))
        {
            System.out.println("Character is alphabet " +ch);
        }
        else if(ch >= '0' && ch <= '9')
        {
            System.out.println("Character is digit " +ch );
        }
        else
            {
            System.out.println("Character is special character " +ch);
        }
    }
}
