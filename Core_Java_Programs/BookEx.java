//4 example of copying values without constructor

public class BookEx
{
    String bookname;
    String author;

    public BookEx(String b, String a)
    {
        bookname = b;
        author =a;
    }
    public BookEx()
    {
    }
    void displaydata()
    {
        System.out.println("Bookname = " + bookname);
        System.out.println("author : " + author);
    }
}
class testbook{
    public static void main(String[] arg)
    {
        BookEx b=new BookEx("oracle","richard");
        BookEx b1=new BookEx();
        b1.bookname=b.bookname;
        b1.author=b.author;
        b.displaydata();
        b1.displaydata();

    }
}
