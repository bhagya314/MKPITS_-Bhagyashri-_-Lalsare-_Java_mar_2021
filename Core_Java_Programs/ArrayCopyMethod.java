//wap to use arraycopy method to copy some
//characters from one array to another array.

import java.util.*;
public class ArrayCopyMethod
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        char[] copyFrom={'d','e','c','a','f','f','e','i','n','a','t','e','d'};
        char[] copyTo=new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));
    }
}
