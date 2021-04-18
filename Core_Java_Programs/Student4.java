//intilizing using constructor

public class Student4
{
    int id;
    String name;

    public Student4 (int i,String n)
    {
        id=i;
        name=n;
    }
    public void displayInformation()
    {
        System.out.println("Id is "+id+":Name is"+name);
    }
}
class teststudent2
{
    public static void main(String args [])
    {
        Student4 s4 = new Student4(14, "bhagya");
        s4.displayInformation();
    }
}
