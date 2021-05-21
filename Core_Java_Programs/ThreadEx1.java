//Let's understand it by the example given below:
package Com.Mkpits.Java.AWT.May18;

public class ThreadEx1 extends Thread{
    public void run(){
        System.out.println("running...");
    }
    public static void main(String args[]){
        ThreadEx1 t1=new ThreadEx1();
        t1.start();
        t1.start();
    }
}
