//Java Thread Example by implementing Runnable interface
package Com.Mkpits.Java.AWT.May18;

public class ThreadEx3 implements Runnable{
    public void run(){
        System.out.println("thread is running...");
    }

    public static void main(String args[]){
        ThreadEx3 m1=new ThreadEx3();
        Thread t1 =new Thread(m1);
        t1.start();
    }
}
