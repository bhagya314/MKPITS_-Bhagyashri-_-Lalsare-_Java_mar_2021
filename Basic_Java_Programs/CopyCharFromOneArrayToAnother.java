//wap to use copyofrange method of array class
//to copy some characters from one array to another
//array.


import java.util.*;
public class CopyCharFromOneArrayToAnother
{
    public static void main(String arg[])
    {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f',
                'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd'};
        char[] copyTo =
                java.util.Arrays.copyOfRange(copyFrom, 2, 8);
        System.out.println(new String(copyTo));

    }
}


