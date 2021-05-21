//Example of currentThread() method
package Com.Mkpits.Java.AWT.May18;

public class ThreadEx6 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String args[]){
        ThreadEx6 t1=new ThreadEx6();
        ThreadEx6 t2=new ThreadEx6();

        t1.start();
        t2.start();
    }
}