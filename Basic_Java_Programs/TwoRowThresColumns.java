//create a 2 array of 2 rows and 3 columns in
//java

import java.util.*;
public class TwoRowThresColumns
{
    public static void main(String[] args){
        int a,b;
        String name[][]={{"sonu","sushi","Sho"},{"Shri","Sanvi","bhagya"}};

        for(a=0;a<2;a++)
        {
            for(b=0;b<3;b++)
            {
                System.out.print("\t"+name[a][b]);
            }
            System.out.println();
        }
    }
}
