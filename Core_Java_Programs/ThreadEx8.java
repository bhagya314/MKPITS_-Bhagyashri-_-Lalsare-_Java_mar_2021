//Another Example of priority of a Thread:
package Com.Mkpits.Java.AWT.May18;

public class ThreadEx8 extends Thread {
    public void run() {
        System.out.println("current thread name " + Thread.currentThread().getName());
        System.out.println("current thread priority " + Thread.currentThread().getPriority());
    }

    public static void main(String[] arg) {
        ThreadEx8 t1=new ThreadEx8();
        ThreadEx8 t2=new ThreadEx8();
        ThreadEx8 t3=new ThreadEx8();

        t1.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}