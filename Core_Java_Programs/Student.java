//1-create a class student having fields id and name

public class Student
{
    int id;
    String name;

    public static void main(String args[])
    {
        Student s1=new Student();
        s1.id=123;
        s1.name="Bhagya";
        System.out.println("Id is " +s1.id);
        System.out.println("Name is " +s1.name);

    }
}
