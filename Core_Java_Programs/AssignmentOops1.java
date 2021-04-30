//Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'.
// Assign the valueof roll_no as '2' and that of name as "John" by creating an object of the class Student.

package Com.mkpits.java.OopsAssignment;
class Student
{
        String name="John";
        int rno=2;
}
public class AssignmentOops1
{
    public static void main(String[] args)
    {
        Student s=new Student();
        System.out.println(s.name);
        System.out.println(s.rno);
    }
}
