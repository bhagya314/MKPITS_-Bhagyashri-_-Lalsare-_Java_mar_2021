//Example of priority of a Thread:
package Com.Mkpits.Java.AWT.May18;

public class ThreadEx7 extends Thread{
    public void run(){
        System.out.println("running thread name is:"+Thread.currentThread().getName());
        System.out.println("running thread priority is:"+Thread.currentThread().getPriority());

    }
    public static void main(String args[]){
        ThreadEx7 m1=new ThreadEx7();
        ThreadEx7 m2=new ThreadEx7();
        m1.setPriority(Thread.MIN_PRIORITY);
        m2.setPriority(Thread.MAX_PRIORITY);
        m1.start();
        m2.start();

    }
}