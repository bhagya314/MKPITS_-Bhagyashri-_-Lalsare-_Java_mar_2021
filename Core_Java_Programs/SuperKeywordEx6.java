//
package Com.mkpits.java.SuperKeyWord;
import java.util.*;
class person1
{
    String name;
    String address;
    person1(String name,String address)
    {
        this.name=name;
        this.address=address;
    }
    void displaydata()
    {
        System.out.println("name = " + name + " address = " + address);

    }
}
//creating a derived class student
class student2 extends person1
{
    int rno;
    int marks;
    student2(int rno,int marks,String name,String address)
    {
        super(name,address);//calling base class constructor with 2 parameters
        this.rno=rno;
        this.marks=marks;
    }
    void displaydata()
    {
        super.displaydata();
        System.out.println("rno = " + rno + " marks = " + marks);
    }
}
public class SuperKeywordEx6
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter student details : ");
        int rno=sc.nextInt();
        int marks=sc.nextInt();
        String name=sc.next();
        String address=sc.next();
        student2 s=new student2(rno,marks,name,address);//creating child class constructor will contain automatically
        s.displaydata();
    }
}
