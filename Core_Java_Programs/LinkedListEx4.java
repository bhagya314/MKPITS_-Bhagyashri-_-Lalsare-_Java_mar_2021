//Java LinkedList Example to reverse a list of elements
package Com.Mkpits.Java.AWT.May25;
import java.util.*;
public class LinkedListEx4 {
    public static void main(String args[]){

        LinkedList<String> ll=new LinkedList<String>();
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");

        //Traversing the list of elements in reverse order
        Iterator i=ll.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}
