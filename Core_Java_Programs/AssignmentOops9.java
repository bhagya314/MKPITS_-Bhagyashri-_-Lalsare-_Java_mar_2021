//Print the sum, difference and product of two complex numbers by creating a class
// named 'Complex' with separate methods for each operation whose real and imaginary parts
// are entered by user.

package Com.mkpits.java.OopsAssignment;
class Complex
{
    int real;
    int image;

    public Complex(int real, int image)
    {
        this.image=image;
        this.real=real;
    }

    public static Complex add(Complex a, Complex b)
    {
        return new Complex((a.real+b.real),(a.image+b.image));
    }

    public static Complex difference(Complex a, Complex b)
    {
        return new Complex((a.real-b.real),(a.image-b.image));
    }

    public static Complex product(Complex a, Complex b)
    {
        return new Complex(((a.real*b.real)-(a.image*b.image)),((a.real*b.image)+(a.image*b.real)));
    }

    public void printComplex()
    {
        if (real==0 && image!=0)
        {
            System.out.println(image+"i");
        }
        else if (real!=0 && image ==0)
        {
            System.out.println(real);
        }
        else
            {
            System.out.println(real+"+"+image+"i");
        }
    }
}

public class AssignmentOops9
{
    public static void main(String[] args)
    {
        Complex c=new Complex(4,5);
        Complex d=new Complex(9,4);

        Complex x=Complex.add(c,d);
        Complex y=Complex.difference(c,d);
        Complex z=Complex.product(c,d);

        x.printComplex();
        y.printComplex();
        z.printComplex();
    }
}
