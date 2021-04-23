//example of hierarchical inheritance.
//6 create a base class person and create a student class derieved from person class
//and create another class employee derieved from person class
package Com.mkpits.java.Inheritance;
import java.util.*;
class person6
{
    String name;
    String address;
    void getperson6data(String name,String address)
    {
        this.name=name;
        this.address=address;
    }
    void displayperson6data()
    {
        System.out.println("name = " +name + " address= "+ address);
    }
}
class student6 extends person6
{
    int rno;
    int marks;
    public void getstudent6data(int rno,int marks,String name,String address)
    {
        getperson6data(name,address);
        this.rno=rno;
        this.marks=marks;
    }
    public void displaystudent6data()
    {
        displayperson6data();
        System.out.println("rno = " +rno + " marks = "+ marks);
    }
}
class employee extends person6
{
    int empno;
    int salary;
    public void getemployeedata(int empno,int salary,String name,String address)
    {
        getperson6data(name,address);
        this.empno=empno;
        this.salary=salary;
    }
    public void displayemployeedata()
    {
        displayperson6data();
        System.out.println("empno " + empno);
        System.out.println("salary " + salary);
    }
}
public class InheritanceEx6
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter student details");
        int rno=scan.nextInt();
        String name=scan.next();
        String address=scan.next();
        int marks=scan.nextInt();
        student6 s=new student6();
        s.getstudent6data(rno,marks,name,address);
        s.displaystudent6data();
        System.out.println("enter employee details");
        System.out.println("enter empno");
        int empno=scan.nextInt();
        System.out.println("enter employee name");
        String empname=scan.next();
        System.out.println("enter employee address");
        String empaddress=scan.next();
        System.out.println("enter employee salary");
        int salary=scan.nextInt();
        employee emp=new employee();
        emp.getemployeedata(empno,salary,name,address);
        emp.displayemployeedata();
    }
}
