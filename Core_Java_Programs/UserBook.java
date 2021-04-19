//6- array of object by accepting values from the
//user

import java.util.Scanner;
public class UserBook
{
    String bookname;
    String author;
    public UserBook(String bn,String au)
    {
        bookname=bn;
        author=au;
// display();
    }
    public void display()
    {
        System.out.println("book name is "+
                bookname);
        System.out.println("author is "+ author);
    }
}
class Bookex {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        UserBook b[] = new UserBook[3];
        String bn;
        String au;
        for (int i = 0; i < 3; i++) {
            System.out.println("enter bookname and author");
            bn = scan.next();
            au = scan.next();
            b[i] = new UserBook(bn, au);
        }
// display the values
        for (int i = 0; i < 3; i++) {
            b[i].display();
        }
    }
}
