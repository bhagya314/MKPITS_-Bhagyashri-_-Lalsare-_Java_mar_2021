//1) Method Overloading: changing no. of arguments
package Com.mkpits.java.MethodOverloading;
class calculate
{
    static int Addition(int n1,int n2)
    {
        return n1+n2;
    }
    static int Addition(int n1,int n2,int n3)
    {
        return n1+n2+n3;
    }
}
public class ChangingNoOfArgument
{
    public static void main(String[] args)
    {
        calculate cal=new calculate();
        int res = cal.Addition(2,3);
        System.out.println("Add of 2 no is " +res);
        res = cal.Addition(2,3,4);
        System.out.println("Add of 3 no is " +res);
    }
}
