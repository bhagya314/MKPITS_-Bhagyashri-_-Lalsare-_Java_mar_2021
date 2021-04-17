//call by value example

import java.util.*;
public class CallByValue
{
    static int num;
    public static void changevalue(int num)
    {
        num=num+100;
        System.out.println("value of num inside method " + num);
    }
    public static void main(String[] arg)
    {
        num=700;
        changevalue(num);
        System.out.println("value of num after calling method " + num);
    }
}
