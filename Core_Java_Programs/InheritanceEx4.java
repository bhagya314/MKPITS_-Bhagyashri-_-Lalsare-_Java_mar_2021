//4- calling getpersondata method from getstudentdata method .
package Com.mkpits.java.Inheritance;
import java.util.*;
class person4
{
    String name;
    String address;
    public void getperson4data(String name,String address)
    {
        this.name=name;
        this.address=address;
    }
    public void displayperson4data()
    {
        System.out.println("name = " +name + " address= "+ address);
    }
}
class student4 extends person4
{
    int rno;
    int marks;
    public void getstudent4data(int rno,int marks,String name,String address)
    {
        getperson4data(name,address);
        this.rno=rno;
        this.marks=marks;
    }
    public void displaystudent4data()
    {
        displayperson4data();
        System.out.println("rno = " +rno + " marks = "+ marks);
    }
}
public class InheritanceEx4
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter student details");
        int rno=scan.nextInt();
        String name=scan.next();
        String address=scan.next();
        int marks=scan.nextInt();
        student4 s=new student4();
        s.getstudent4data(rno,marks,name,address);
        s.displaystudent4data();
    }
}
