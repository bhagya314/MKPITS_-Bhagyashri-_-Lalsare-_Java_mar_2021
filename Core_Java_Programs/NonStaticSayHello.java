//12 - create a non static sayhello method

import java.util.*;
public class NonStaticSayHello
{
    public static void main(String[] arg)
    {
        NonStaticSayHello s1=new NonStaticSayHello();
        s1.sayHello();
        NonStaticSayHello s2=new NonStaticSayHello();
        s2. sayHello();
        sayHi();
    }

    void sayHello()
    {
        System.out.println("hello everybody");
        System.out.println("how are you");
        System.out.println("what are you doing");
    }
    static void sayHi()
    {
        System.out.println("hello from student ");
    }
}
