//Example of Java URLConnection class
package Com.Mkpits.Java.AWT.May31;
import java.io.*;
import java.net.*;
public class URLConnectionEx {
    public static void main(String[] args){
        try{
            URL url=new URL("http://www.google.com/java-tutorial");
            URLConnection urlcon=url.openConnection();
            InputStream stream=urlcon.getInputStream();
            int i;
            while((i=stream.read())!=-1){
                System.out.print((char)i);
            }
        }catch(Exception e){System.out.println(e);}
    }
}
