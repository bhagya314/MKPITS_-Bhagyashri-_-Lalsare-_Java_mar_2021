//awt calculator frame example
package Com.Mkpits.Java.AWT;
import java.awt.*;
class Calculator extends Frame{
    Calculator()
    {
        setTitle("Calculator");
        setSize(220,310);
        TextField t=new TextField();
        t.setBounds(10,30,200,60);
        add(t);

        //first row for calcul
        Button b1=new Button("%");
        b1.setBounds(10,100,50,40);
        add(b1);
        Button b2=new Button("CE");
        b2.setBounds(60,100,50,40);
        add(b2);
        Button b3=new Button("C");
        b3.setBounds(110,100,50,40);
        add(b3);
        Button b4=new Button("/");
        b4.setBounds(160,100,50,40);
        add(b4);

        //second row for calcul
        Button b11=new Button("7");
        b11.setBounds(10,140,50,40);
        add(b11);
        Button b12=new Button("8");
        b12.setBounds(60,140,50,40);
        add(b12);
        Button b13=new Button("9");
        b13.setBounds(110,140,50,40);
        add(b13);
        Button b14=new Button("x");
        b14.setBounds(160,140,50,40);
        add(b14);

        //third row for calcul
        Button b21=new Button("4");
        b21.setBounds(10,180,50,40);
        add(b21);
        Button b22=new Button("5");
        b22.setBounds(60,180,50,40);
        add(b22);
        Button b23=new Button("6");
        b23.setBounds(110,180,50,40);
        add(b23);
        Button b24=new Button("-");
        b24.setBounds(160,180,50,40);
        add(b24);

        //fourth row for calcul
        Button b31=new Button("1");
        b31.setBounds(10,220,50,40);
        add(b31);
        Button b32=new Button("2");
        b32.setBounds(60,220,50,40);
        add(b32);
        Button b33=new Button("3");
        b33.setBounds(110,220,50,40);
        add(b33);
        Button b34=new Button("+");
        b34.setBounds(160,220,50,40);
        add(b34);

        //fifth row for calcul
        Button b41=new Button("00");
        b41.setBounds(10,260,50,40);
        add(b41);
        Button b42=new Button("0");
        b42.setBounds(60,260,50,40);
        add(b42);
        Button b43=new Button(".");
        b43.setBounds(110,260,50,40);
        add(b43);
        Button b44=new Button("=");
        b44.setBounds(160,260,50,40);
        add(b44);

        setLayout(null);
        setVisible(true);
    }
}
public class AwtCalculatorEx1
{
    public static void main(String arg[]){
        Calculator c=new Calculator();
    }
}
