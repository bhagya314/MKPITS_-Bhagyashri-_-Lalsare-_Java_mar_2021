//program using initilizing using method-

public class Student3
{
    int id;
    String name;

    public void insertRecord(int i,String n)
    {
        id=i;
        name=n;
    }
    public void displayInformation()
    {
        System.out.println("ID is " +id+ ":name is " +name);
    }
}
class student2
{
    public static void main(String args [])
    {
        Student3 s1=new Student3();
        Student3 s2=new Student3();
        s1.insertRecord(14,"Bhagya");
        s2.insertRecord(15,"Soniya");

        s1.displayInformation();
        s2.displayInformation();
    }
}