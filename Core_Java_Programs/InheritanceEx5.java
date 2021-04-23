//5- example of multilevel inheritance
//create a class person , then create a class student derived from person class and then create a class
//parttimestudent derieved from student class

package Com.mkpits.java.Inheritance;
import java.util.*;
class person5
{
    String name;
    String address;
    void getperson5data(String name,String address)
    {
        this.name=name;
        this.address=address;
    }
    void displayperson5data()
    {
        System.out.println("name = " +name + " address= "+ address);

    }
}
class student5 extends person5
{
    int rno;
    int marks;
    public void getstudent5data(int rno,int
            marks,String name,String address)
    {
        getperson5data(name,address);
        this.rno=rno;
        this.marks=marks;
    }
    public void displaystudent5data()
    {
        displayperson5data();
        System.out.println("rno = " +rno + " marks = "+ marks);
    }
}
class parttimestudent extends student5
{
    int noofhours;
    public void getparttimestudentdata(int rno,int
            marks,String name,String address,int hours)
    {
        getstudent5data(rno,marks,name,address);
            this.noofhours=hours;
    }
    public void displayparttimestudentdata()
    {
        displaystudent5data();
        System.out.println("no of hours " + noofhours);
    }
}
public class InheritanceEx5
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter parttime student details");
        int rno=scan.nextInt();
        String name=scan.next();
        String address=scan.next();
        int marks=scan.nextInt();
        int hours=scan.nextInt();
        parttimestudent s=new parttimestudent();
        s.getparttimestudentdata(rno,marks,name,address,hours);
        s.displayparttimestudentdata();
    }
}
