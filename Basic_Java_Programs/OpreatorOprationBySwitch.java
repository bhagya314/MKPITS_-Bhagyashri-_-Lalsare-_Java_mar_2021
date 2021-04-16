//wap to accept 2 no. and operator and display the result. using switch.

import java.util.*;
public class OpreatorOprationBySwitch
{
    public static void main(String[] arg)
    {
        Scanner s = new Scanner(System.in);
        int n1, n2, res = 0;
        char op;
        System.out.println("enter number1");
        n1=s.nextInt();
        System.out.println("enter number2");
        n2=s.nextInt();
        System.out.println("enter +,-,*");
        op=s.next().charAt(0);
        switch (op)
        {
            case '+':
                res=n1+n2;
                break;
            case '-':
                res=n1-n2;
                break;
            case '*':
                res=n1*n2;
                break;
            default:
                System.out.println("invalid opertor");
                break;
        }
        System.out.println("result = " + res);
    }
}
