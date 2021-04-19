//2 class having constructor and method with the same name of class.. overloading

public class Student14
{
    int id;
    String name;
    int age;

    public Student14(int i, String n)
    {
        id=i;
        name=n;
    }
    public Student14(int i, String n, int a)
    {
        id=i;
        name=n;
        age=a;
    }
    void displaydata()
    {
        System.out.println( "id is " +id + "name is : " +name +"age is : " + age);
    }
    public void Student()
    {
        System.out.println("Hello from student world");
    }
}
class teststudent
{
    public static void main(String[] arg)
    {
        // object
        Student14 s1=new Student14(111,"amit");
        s1.displaydata();
        Student14 s2=new Student14(112,"nish",23);

        s2.displaydata();
        s2.Student();

    }
}

