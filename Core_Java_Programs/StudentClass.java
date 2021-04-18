//another example of student class


public class StudentClass
{
    public static void main(String[] arg)

    {
        Student1 s1=new Student1();
        s1.getstudentdata(123,"amit");
        s1.displaystudentdata();
    }
}

class Student1
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
