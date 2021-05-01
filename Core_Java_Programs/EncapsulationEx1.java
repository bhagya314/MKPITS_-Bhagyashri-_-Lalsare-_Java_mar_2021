//A Java class which is a fully encapsulated class. data member and getter and setter methods.

package Com.mkpits.java.Encapsulation;
class Student
{
    //private data member
    private String name;
    //getter method for name
    public String getName(){
        return name;
    }
    //setter method for name
    public void setName(String name){
        this.name=name;
    }
}
public class EncapsulationEx1
{
    public static void main(String[] args)
    {
        //creating instance of the encapsulated class
        Student s=new Student();
        //setting value in the name member
        s.setName("vicky");
        //getting value of the name member
        System.out.println(s.getName());
    }
}
