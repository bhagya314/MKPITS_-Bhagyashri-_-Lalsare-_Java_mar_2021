//program on Iterating ArrayList using For-each loop
package Com.Mkpits.Java.AWT.May24.Collection;
import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.*;
public class ArrayListForLoopEx1 {
    public static void main(String args[]){
        ArrayList<String> stud=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<+3;i++){
            System.out.println("enter student name");
            String sn=sc.next();
            stud.add(sn);
        }
        for(String str:stud){
            System.out.println("Student name: " +str);
        }
    }
}
