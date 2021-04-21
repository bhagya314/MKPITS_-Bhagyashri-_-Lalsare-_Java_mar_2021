//constructor chaning example
package Com.mkpits.java.This154;
class Book1
{
    String bookname,author;
    int price;

    public Book1(String bookname,String author)
    {
        this.bookname=bookname;
        this.author=author;
    }
    public Book1(String bookname,String author,int price)
    {
        this(bookname,author);
        this.price=price;
    }
    public void displaybookinfo()
    {
        System.out.println(bookname + author + price);
    }
}
public class ConstructorChaningEx
{
    public static void main(String[] args)
    {
        Book1 bb=new Book1("oracle","richards");
        bb.displaybookinfo();
        Book1 bb1=new Book1("oracle","richards",1200);
        bb1.displaybookinfo();
    }
}
