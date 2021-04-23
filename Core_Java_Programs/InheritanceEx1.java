//1 - create a parent class person having field name and address , create a derived class student
//inherited from person class having additional fields rno and marks.
package Com.mkpits.java.Inheritance;
//creating a parent class person
class Person
{
    String name;
    String address;
}
//creating a derieved class student
class Student extends Person
{
    int rno;
    int marks;
}
public class InheritanceEx1
{
    public static void main(String args [])
    {
        Student s=new Student();
        s.rno=111;
        s.name="amit";
        s.address="Nagpur";
        s.marks=789;
        System.out.println(s.rno+":"+s.name+":"+s.address+":"+s.marks);
    }
}
