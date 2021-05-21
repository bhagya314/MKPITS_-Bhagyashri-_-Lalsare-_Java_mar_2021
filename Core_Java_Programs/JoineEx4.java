//Example of currentThread() method
package Com.Mkpits.Java.AWT.May18;

public class JoineEx4 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String args[]){
        JoineEx4 t1=new JoineEx4();
        JoineEx4 t2=new JoineEx4();

        t1.start();
        t2.start();
    }
}