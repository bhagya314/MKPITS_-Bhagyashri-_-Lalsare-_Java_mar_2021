//Example of join(long miliseconds) method
package Com.Mkpits.Java.AWT.May18;

public class JoineEx2 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(500);
            }catch(Exception e){System.out.println(e);}
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        JoineEx2 t1=new JoineEx2();
        JoineEx2 t2=new JoineEx2();
        JoineEx2 t3=new JoineEx2();
        t1.start();
        try{

            t1.join(1500);
        }catch(Exception e){System.out.println(e);}

        t2.start();
        t3.start();
    }
}