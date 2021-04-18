//create a program to used student class in different class

public class Student1
{
    int id;
    String name;
}
class teststudent
{
    public static void main(String args [])
    {
        Student1 s1=new Student1();
        s1.id=14;
        s1.name="Bhagya";
        System.out.println("ID is " +s1.id);
        System.out.println("Nmsae is " +s1.name);

    }
}