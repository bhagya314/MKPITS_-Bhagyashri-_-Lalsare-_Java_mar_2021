//example of java instanceof operator

package Com.mkpits.java.InstanceOperator;

class Animal{}
class Dog1 extends Animal
{
    public static void main(String args[])
    {
        Dog1 d=new Dog1();
        System.out.println(d instanceof Animal);//true
    }
}

