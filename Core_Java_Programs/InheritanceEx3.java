//3- create a parent class person having field name and address and methods getpersondata and
// displaypersondata and create a derived class student inherited from person class having
// additional fields rno and marks. and methods getstudentddata and displaystudent data.

package Com.mkpits.java.Inheritance;
import java.util.*;
class Person3
{
    String name;
    String address;

    public void getperson3data(String name,String address)
    {
        this.name=name;
        this.address=address;
    }
    public void displayperson3data()
    {
        System.out.println("name= "+name+"address= "+address);
    }
}
class Student3 extends Person3
{
    int rno;
    int marks;

    public void getstudent3data(int rno,int marks)
    {
        this.rno=rno;
        this.marks=marks;
    }
    public void displaystudent3data()
    {
        System.out.println("rno = "+rno+"marks = "+marks);
    }
}
public class InheritanceEx3
{
    public static void main(String args [])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter student details");
        int rno=scan.nextInt();
        String name=scan.next();
        String address=scan.next();
        int marks=scan.nextInt();
        Student3 s=new Student3();
        s.getperson3data(name,address);
        s.getstudent3data(rno,marks);
        s.displayperson3data();
        s.displaystudent3data();
    }
}
