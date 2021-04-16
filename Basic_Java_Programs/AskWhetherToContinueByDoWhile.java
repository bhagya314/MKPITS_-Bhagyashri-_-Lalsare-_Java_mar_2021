//wap to ask whether to continue or not using do while loop

import java.util.*;
public class AskWhetherToContinueByDoWhile
{
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        int num,orgnum;

        int fact;
        char ans='y';
        do {
            System.out.println("enter number");
            num = s.nextInt();
            orgnum = num;
            fact = 1;
            while (num > 0) {
                fact = fact * num;
                num--;
            }
            System.out.println("factorial of " +
                    orgnum + " = " + fact);
            System.out.println("do you want to continue press y or n");
            ans = s.next().charAt(0);
        } while(ans == 'y');
    }
}
