//another Java Thread Example by implementing Runnable interface
package Com.Mkpits.Java.AWT.May18;

public class ThreadEx4 implements Runnable {
    public void run() {
        for(int i=1;i<25;i++) {
            System.out.println("my thread is running " + i);
        }
    }

    public static void main(String[] arg) {
        ThreadEx4 th=new ThreadEx4();
        Thread t=new Thread(th);
        t.start();
        Thread t1=new Thread(th);
        t1.start();
    }
}
