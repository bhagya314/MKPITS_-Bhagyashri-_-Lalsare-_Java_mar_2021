//Example of Sending DatagramPacket by DatagramSocket
package Com.Mkpits.Java.AWT.May31;
import java.net.*;
public class DatagramSocketEx1 {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();

        String str = "Welcome java";
        InetAddress ip = InetAddress.getByName("127.0.0.1");

        DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);
        ds.send(dp);
        ds.close();
    }
}
