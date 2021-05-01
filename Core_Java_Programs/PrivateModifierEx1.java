//Private: The access level of a private modifier is only within the class. It cannot be accessed from
//outside the class.
package Com.mkpits.java.AccessModifiers;
class A
{
    private int a=20;
    private void msg(){System.out.println("hello" +a);}
    public void showmsg(){
        a=40;
        msg();
    }
}
public class PrivateModifierEx1
{
    public static void main(String[] args)
    {
        A a=new A();
        //a.a=20;
        //a.msg();as msg is private method it shows error
        a.showmsg();
    }
}
