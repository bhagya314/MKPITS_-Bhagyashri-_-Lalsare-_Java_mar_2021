//2.Assign and print the roll number, phone number and address of two students having names "Sam"
// and "John" respectively by creating two objects of class 'Student'.

package Com.mkpits.java.OopsAssignment;
class Student1
{
    int rno;
    long phoneno;
    String name;
    String address;
}
public class AssignmentOops2
{
    public static void main(String[] args) {
        Student1 s=new Student1();
        Student1 s1=new Student1();
        s.name="sam";
        s.rno=1;
        s.phoneno=98765432;
        s.address="chandrapur";
        s1.name="John";
        s1.rno=2;
        s1.phoneno=23456789;
        s1.address="ghugus";
        System.out.println(s.name + ":" + s.rno + ":" + s.phoneno + ":" + s.address);
        System.out.println(s1.name + ":" + s1.rno + ":" + s1.phoneno + ":" + s1.address);

    }
}
