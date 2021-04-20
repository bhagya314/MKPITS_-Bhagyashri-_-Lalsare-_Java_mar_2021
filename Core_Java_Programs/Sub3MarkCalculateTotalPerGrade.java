//3- wap to accept 3 subject marks and calculate total ,
// percentage and grade (using if else if)

import java.util.*;
public class Sub3MarkCalculateTotalPerGrade
{
    public static void main(String[] args)
    {
        int s1,s2,s3,total;
        float per;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 1st subject marks : ");
        s1=sc.nextInt();
        System.out.println("Enter 2nd subject marks : ");
        s2=sc.nextInt();
        System.out.println("Enter 3rd subject marks : ");
        s3= sc.nextInt();

        total=s1+s2+s3;
        per=(float)(total/300.0f)*100;

        System.out.println("Total Marks = "+total +" / 300");
        System.out.println("Percentage = "+per+"%");

        if(per>=75)
            System.out.println("Grade : Distinction");
        else if(per>=60 && per<75)
            System.out.println("Grade : First class");
        else if(per>=40 && per<60)
            System.out.println("Grade : Second class");
        else
            System.out.println("You have failed the exam");
    }
}
