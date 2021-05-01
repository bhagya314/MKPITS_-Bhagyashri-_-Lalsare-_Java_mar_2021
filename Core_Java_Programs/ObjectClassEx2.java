//A Java class to test the encapsulated class Account.
package Com.mkpits.java.ObjectClass;

import java.lang.*;
class parent
{

}
class tob1 extends parent
{
    public static void main(String[] args)
    {
        parent t=new tob1();
        Object obj=t.getClass();
        System.out.println("obj = " + obj);
    }
}
