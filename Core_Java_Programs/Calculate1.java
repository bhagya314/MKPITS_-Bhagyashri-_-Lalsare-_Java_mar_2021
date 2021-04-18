//accept add etc

import java.util.*;
public class Calculate1
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        Calculate2 cal2=new Calculate2();
        System.out.println("enter 2 number");
        int n1=scan.nextInt();
        int n2=scan.nextInt();
        System.out.println("enter add,sub,mul");
        String op=scan.next();
        switch (op)
        {
            case"add":
                int result = cal2.addition(n1, n2);
                System.out.println("addition="+result);
                break;

            case "sub":
                result=cal2.subtraction(n1,n2);
                System.out.println("subtraction="+result);
                break;

            case"mul":
                result=cal2.multiplication(n1,n2);
                System.out.println("multiplication="+result);
                break;

            default:
                System.out.println("invalid entry");
                break;
        }
    }
}
class Calculate2
{
   int num1,num2;

   int addition (int n1,int n2)
   {
        num1=n1;
        num2=n2;
        int res=num1+num2;
        return res;
   }
   int subtraction(int n1,int n2)
   {
       num1=n1;
       num2=n2;
       int res=num1-num2;
       return res;
   }
   int multiplication(int n1,int n2)
   {
       num1=n1;
       num2=n2;
       int res=num1*num2;
       return res;
   }
}

