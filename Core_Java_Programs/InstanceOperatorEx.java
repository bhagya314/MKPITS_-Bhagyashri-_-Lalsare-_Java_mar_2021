//the simple example of instance operator where it tests the current class.
package Com.mkpits.java.InstanceOperator;

class Simple{
    public static void main(String args[])
    {
        Simple s=new Simple();
        System.out.println(s instanceof Simple);//true
    }
}

