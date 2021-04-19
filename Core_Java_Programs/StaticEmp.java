//static variable example

public class StaticEmp
{
    int empno;
    String empname;
    static String company="mkpits";
    public StaticEmp(int e,String en)
    {
        empno=e;
        empname=en;
    }
    public void display()
    {
        System.out.println(empno + empname + company);
    }
}

class Staticex
{
    public static void main(String[] args)
    {
        StaticEmp emp1=new StaticEmp(11,"amit");
        StaticEmp emp2=new StaticEmp(12,"raj");
        emp1.display();
        emp2.display();
        StaticEmp.company="mk placements";
        emp1.display();
        emp2.display();
    }
}

