//example of set and get of arraylist class.
package Com.Mkpits.Java.AWT.May24.Collection;
import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.*;
public class SeyGetArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> stud=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=5;i++){
            System.out.println("enter student name");
            String sn=sc.next();
            stud.add(sn);
        }
        System.out.println("tudent ata index 1:"+stud.get(1));
        stud.set(1,"Rajesh");

        for (String str:stud){
            System.out.println("student name"+str);
        }
    }
}
