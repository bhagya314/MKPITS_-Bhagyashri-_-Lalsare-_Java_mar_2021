//3.Write a program to print the area and perimeter of a triangle having sides of 3,4 and 5
// units by creating a class named 'Triangle' without any parameter in its constructor.
package Com.mkpits.java.OopsAssignment;
class Triangle
{
    int x,y,z;

    public double area()
    {
        double s=((x+y+z)/2);
        return Math.pow((s*(s-x)*(s-y)*(s-z)),.5);
    }

    public float perimeter()
    {
        return (float) ((x+y+z)/2);
    }
}
public class AssignmentOops3
{
    public static void main(String[] args)
    {
        Triangle t=new Triangle();
        t.x=3;
        t.y=4;
        t.z=5;
        System.out.println("Area of triangle is : "+t.area());
        System.out.println("Perimeter of triangle is : "+t.perimeter());
    }
}
