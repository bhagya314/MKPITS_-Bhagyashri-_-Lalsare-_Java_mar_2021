//create a class calculate having member variable num1 and num2
//and methods addition, substraction and mutliplication

import java.util.*;
public class CalculateAddSubMul
{
    public static void main(String[] arg)
    {
        Scanner scan=new Scanner(System.in);
        Calculate cal1 = new Calculate();
        System.out.println("enter 2 numbers ");
        int n1=scan.nextInt();
        int n2=scan.nextInt();

        int result = cal1.addition(n1,n2);
        System.out.println("additon " + result);

        result = cal1.subtraction(n1,n2);
        System.out.println("substraction " +result);

        result =cal1.multiplication(n1,n2);
        System.out.println("multiplication " + result);
    }
}
class Calculate
{
    int num1,num2;

    int addition(int n1,int n2)
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
