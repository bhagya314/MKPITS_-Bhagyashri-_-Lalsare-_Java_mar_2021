
public class student2
{
    public static void main(String[] arg)

    {
        Student s1=new Student();
        s1.getstudentdata(123,"amit");
        s1.displaystudentdata();
    }
}

class Student
{
    int rno;
    String name;

    void getstudentdata(int r, String n)
    {
        rno = r;
        name = n;
    }
    void displaystudentdata()
    {
        System.out.println("rno = " + rno);
        System.out.println("name = " + name);
    }
}
