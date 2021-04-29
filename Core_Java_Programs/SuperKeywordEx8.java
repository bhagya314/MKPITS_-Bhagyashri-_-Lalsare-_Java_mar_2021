//super example: real used
//Let's see the real use of super keyword. Here, Emp class inherits Person class so all the properties of
//Person will be inherited to Emp by default. To initialize all the property, we are using parent class
//constructor from child class. In such way, we are reusing the parent class constructor.

package Com.mkpits.java.SuperKeyWord;
class person8
{
    int id;
    String name;
    person8(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
}
class Emp extends person8
{
    float salary;
    Emp(int id,String name,float salary)
    {
        super(id,name);//reusing parent constructor
        this.salary=salary;
    }
    void display()
    {
        System.out.println(id + " " + name + " " + salary);
    }
}
public class SuperKeywordEx8
{
    public static void main(String[] args)
    {
        Emp e=new Emp(1,"vicky",23000.0f);
        e.display();
    }
}
