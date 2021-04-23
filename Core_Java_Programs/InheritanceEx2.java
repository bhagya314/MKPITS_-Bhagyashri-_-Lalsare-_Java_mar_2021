//create a parent class person having field name and address and create a derived class student
//inherited from person class having additional fields rno and marks. and methods getstudentddata and
//displaystudent data.

package Com.mkpits.java.Inheritance;
import java.util.*;
class Person1
{
    String name;
    String address;
}
class Student1 extends Person1
{
    int rno;
    int marks;

    public void getstudent1data(String name,String address,int rno,int marks)
    {
        this.rno=rno;
        this.name=name;
        this.address=address;
        this.marks=marks;
    }
    public void displaystudent1data()
    {
        System.out.println(rno+":"+name+":"+address+":"+marks);
    }
}
public class InheritanceEx2
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter student details");
        int rno=scan.nextInt();
        String name=scan.next();
        String address=scan.next();
        int marks=scan.nextInt();
        Student1 s1=new Student1();
        s1.getstudent1data(name,address,rno,marks);
        s1.displaystudent1data();
    }
}
