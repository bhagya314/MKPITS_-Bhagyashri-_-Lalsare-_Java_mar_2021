//MainThreadStack Problem if you direct call run() method
package Com.Mkpits.Java.AWT.May18;

public class ThreadEx10 extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        ThreadEx10 t1=new ThreadEx10();
        ThreadEx10 t2=new ThreadEx10();

        t1.run();
        t2.run();

    }
}
