//example to traverse the ArrayList elements using the for-each loop
package Com.Mkpits.Java.AWT.May24;
import java.util.*;
public class ArrayListEx3 {
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        //Traversing list through for-each loop
        for(String Fruits:list)
            System.out.println(Fruits);
    }
}
