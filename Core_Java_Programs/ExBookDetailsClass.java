//create a class book having fields bookid,bookname,author,price and methods getbookdata and display
//bookdata

import java.util.*;
public class ExBookDetailsClass
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        book b1=new book();
        System.out.println("enter book id, name, author and price :");
        int bi=sc.nextInt();
        String bn=sc.next();
        String a=sc.next();
        int p=sc.nextInt();
        b1.getbookdata(bi,bn,a,p);
        b1.displaybookdata();
    }
}
class book
{
    int bookid;
    String bookname;
    String author;
    int price;

    void getbookdata(int bi,String bn,String a , int p)
    {
        bookid=bi;
        bookname=bn;
        author=a;
        price=p;
    }
    void displaybookdata()
    {
        System.out.println("Book Id is " +bookid);
        System.out.println("Book Name is " +bookname);
        System.out.println("employee designation is " +author);
        System.out.println("employee salary is " +price);
    }
}
