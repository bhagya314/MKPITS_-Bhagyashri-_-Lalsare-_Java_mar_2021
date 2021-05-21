//Java Thread Example by extending Thread class
package Com.Mkpits.Java.AWT.May18;

public class ThreadEx2 extends Thread {
    public void run(){
        System.out.println("thread is running...");
    }
    public static void main(String args[]){
        ThreadEx2 t1=new ThreadEx2();
        t1.start();
    }
}
