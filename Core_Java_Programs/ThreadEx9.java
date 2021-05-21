//What if we call run() method directly instead start() method?
package Com.Mkpits.Java.AWT.May18;

public class ThreadEx9 extends Thread{
    public void run(){
        System.out.println("running...");
    }
    public static void main(String args[]){
        ThreadEx9 t1=new ThreadEx9();
        t1.run();//fine, but does not start a separate call stack
    }
}