//Example of sleep method in java
package Com.Mkpits.Java.AWT.May18;

public class ThreadEx11 extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){System.out.println(e);}
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        ThreadEx11 t1=new ThreadEx11();
        ThreadEx11 t2=new ThreadEx11();

        t1.start();
        t2.start();
    }
}
