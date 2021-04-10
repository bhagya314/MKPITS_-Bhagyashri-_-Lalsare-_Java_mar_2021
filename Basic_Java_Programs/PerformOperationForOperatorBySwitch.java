//wap to accept 2 no. and operator and display the result. using switch.

public class PerformOperationForOperatorBySwitch
{
    public static void main(String args [])
    {
        int num1, num2;
        float res;
        char ch;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the two numbers : ");
        num1=sc.nextInt();
        num2=sc.nextInt();
        System.out.println("Enter the Operation + , - , * , / : ");
        ch=sc.next().charAt(0);
        res=0;

        switch (ch)
        {
            case '+':
                res = (float)num1 + num2;
                break;
            case '-':
                res = (float)num1 - num2;
                break;
            case '*':
                res = (float)num1 * num2;
                break;
            case '/':
                res = (float)num1 / num2;
                break;
            default :
                System.out.println("Entry is invalid");
                break;
        }
        System.out.println("Result is : "+res);
    }
}
