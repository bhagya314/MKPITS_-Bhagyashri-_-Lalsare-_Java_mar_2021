//wap to println output like given below using nested for loop.
//*
//* *
//* * *

import java.util.*;
public class PrintOutputLikeGivenByNestedLoop
{
    public static void main(String[] arg)
    {

        for (int rowcount = 1; rowcount <= 3; rowcount++)
        {
            for (int colcount = 1; colcount <= rowcount; colcount++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
