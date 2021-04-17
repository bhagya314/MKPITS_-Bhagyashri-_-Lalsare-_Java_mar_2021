//function with returning value and no parameters


import java.util.*;
public class FunctnReturningValueNoParameter
{
    static int calculate()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter 3 subject marks");
        int m1=scan.nextInt();
        int m2=scan.nextInt();
        int m3=scan.nextInt();
        int total=m1+m2+m3;
        return total;
    }
    public static void main(String[] arg)
    {

        int totalreturned= calculate();
        System.out.println("total marks " + totalreturned);

    }
}
