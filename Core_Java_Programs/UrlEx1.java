//Example of Java URL class
package Com.Mkpits.Java.AWT.May31;
import java.net.*;
public class UrlEx1 {
    public static void main(String[] args){
        try{
            URL url=new URL("http://www.google.com/java-tutorial");

            System.out.println("Protocol: "+url.getProtocol());

            System.out.println("Host Name: "+url.getHost());
            System.out.println("Port Number: "+url.getPort());
            System.out.println("File Name: "+url.getFile());

        }catch(Exception e){System.out.println(e);}
    }
}
