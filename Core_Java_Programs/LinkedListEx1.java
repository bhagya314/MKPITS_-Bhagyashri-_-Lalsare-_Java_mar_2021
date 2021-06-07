//Java LinkedList Example
package Com.Mkpits.Java.AWT.May25;
import java.util.*;
public class LinkedListEx1 {
    public static void main(String[] args) {

        LinkedList<String> al=new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
