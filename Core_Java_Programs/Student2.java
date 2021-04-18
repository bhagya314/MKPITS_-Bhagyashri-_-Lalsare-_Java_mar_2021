//example of multiple objects-

import java.util.*;
public class Student2
{
    int id;
    String name;
}
class teststudent1
{
    public static void main(String args [])
    {
        Student2 s2=new Student2();
        s2.id=14;
        s2.name="Bhagya";
        Student2 s3=new Student2();
        s3.id=15;
        s3.name="Soniya";
        System.out.println("Id is " +s2.id+  "name is " +s2.name);
        System.out.println("Id is " +s3.id+  "name is " +s3.name);

    }
}