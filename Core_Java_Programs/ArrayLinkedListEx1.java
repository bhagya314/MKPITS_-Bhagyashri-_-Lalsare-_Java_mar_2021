//example where we are using ArrayList and LinkedList both.
package Com.Mkpits.Java.AWT.May25;
import java.util.*;
public class ArrayLinkedListEx1 {
    public static void main(String[] args) {
        List<String> al=new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        List<String> al2=new LinkedList<String>();
        al2.add("James");
        al2.add("Serena");
        al2.add("Swati");
        al2.add("Junaid");

        System.out.println("ArrayList"+al);
        System.out.println("LinkedList"+al2);
    }
}
