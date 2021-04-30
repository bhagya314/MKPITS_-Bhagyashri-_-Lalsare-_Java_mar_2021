//4.Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating
//a class named 'Triangle' with constructor having the three sides as its parameters.

package Com.mkpits.java.OopsAssignment;
class Triangle1 {

    public double area (int x,int y,int z)
    {
        double s = ((x + y + z) / 2);
        return Math.pow((s * (s - x) * (s - y) * (s - z)), .5);
    }

    public float perimeter (int x,int y,int z)
    {
        return (float) ((x + y + z) / 2);
    }
}
public class AssignmentOops4
{
    public static void main(String[] args)
    {
        Triangle1 t=new Triangle1();
        int x=3;
        int y=4;
        int z=5;

        System.out.println("Area of triangle is : "+t.area(x,y,z));
        System.out.println("Perimeter of triangle is : "+t.perimeter(x,y,z));
    }
}
