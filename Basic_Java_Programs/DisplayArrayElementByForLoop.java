import java.util.*;
public class DisplayArrayElementByForLoop
{
    public static void main(String[] arg) {

        int num[] = new int[3];
        num[0]=22;
        num[1]=33;
        num[2]=44;

        for ( int n : num)
        {
            System.out.println("num = " + n);
        }
    }
}
