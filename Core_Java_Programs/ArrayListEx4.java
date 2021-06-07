//Get and Set ArrayList , The get() method returns the element at the specified index, whereas
// the set() method changes the element.
package Com.Mkpits.Java.AWT.May24;
import java.util.*;
public class ArrayListEx4 {
    public static void main(String args[]){
        ArrayList<String> al=new ArrayList<String>();
        al.add("Mango");
        al.add("Apple");
        al.add("Banana");
        al.add("Grapes");

        //accessing the element
        System.out.println("Returning Element:"+al.get(1));

        //changing the element
        al.set(1,"Dates");

        //Traversing list
        for(String fruit:al)

            System.out.println(fruit);
    }
}
