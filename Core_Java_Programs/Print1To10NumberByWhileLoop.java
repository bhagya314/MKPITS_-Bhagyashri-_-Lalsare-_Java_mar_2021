import java.util.Scanner;

public class Print1To10NumberByWhileLoop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num<=10)
        {
            System.out.println("num=" +num);
            num++;
        }
    }
}
