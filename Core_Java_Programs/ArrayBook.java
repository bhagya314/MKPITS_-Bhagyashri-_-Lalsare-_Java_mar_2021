//array of object example

public class ArrayBook
{
    String name;
    String author;

    public ArrayBook(String n,String a)
    {
        name=n;
        author=a;
    }
    void displaydata()
    {
        System.out.println("name is = " + name);
        System.out.println("author is " +author);
    }
}
class testbook1{
    public static void main(String[] arg)
    {
        Book b[]=new Book[3];
        b[0]=new Book("oracle","richard");
        b[1]=new Book("clanguage","kanetkar");
        b[2]=new Book("Basicjava","alex");
        System.out.println("Book1 details are");
        b[0].displaydata();
        System.out.println("Book2 details are");
        b[1].displaydata();
        System.out.println("Book3 details are");
        b[2].displaydata();
    }
}
