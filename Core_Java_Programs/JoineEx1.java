//example of The join() method
package Com.Mkpits.Java.AWT.May18;

public class JoineEx1 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(500);
            }catch(Exception e){System.out.println(e);}
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        JoineEx1 t1=new JoineEx1();
        JoineEx1 t2=new JoineEx1();
        JoineEx1 t3=new JoineEx1();
        t1.start();
        try{
            t1.join();
        }catch(Exception e){System.out.println(e);}

        t2.start();
        t3.start();
    }
}
