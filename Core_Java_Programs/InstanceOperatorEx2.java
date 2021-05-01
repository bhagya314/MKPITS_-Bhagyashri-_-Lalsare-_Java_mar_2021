//example given below where we apply instanceof operator with the variable that have null value.

package Com.mkpits.java.InstanceOperator;

class Dog2
{
    public static void main(String args[])
    {
        Dog2 d=null;
        System.out.println(d instanceof Dog2);//false
    }
}