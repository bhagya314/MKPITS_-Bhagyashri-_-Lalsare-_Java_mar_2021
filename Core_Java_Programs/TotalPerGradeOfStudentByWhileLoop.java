//wap to accept 5 subject marks using while loop calculate total, per, and grade.

import java.util.*;
public class TotalPerGradeOfStudentByWhileLoop
{
    public static void main(String args[])
    {
        int sub,total=0;
        int cnt=1;
        float per;
        Scanner sc=new Scanner(System.in);

        while(cnt<=5)
        {
            System.out.printf("enter subject marks");
            sub=sc.nextInt();
            total = total + sub;
            cnt = cnt ++;
        }
        System.out.printf("total is"+total);
    }
}
