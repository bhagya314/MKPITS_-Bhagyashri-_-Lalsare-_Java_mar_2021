//Private access modifier ex
package Com.mkpits.java.AccessModifiers;
class Person1
{
    private String name;
    private void msg()
    {
        System.out.println("Hello " +name);
    }
    public void getname(String name)
    {
        this.name=name;
        msg();
    }
    public void displayname()
    {
        System.out.println("name is " +name);
    }
}
public class PrivateModifierEx3
{
    public static void main(String[] args)
    {
        Person1 p=new Person1();
        //p.msg();
        p.getname("savi");
        p.displayname();
    }
}
