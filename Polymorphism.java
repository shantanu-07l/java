import java.util.Scanner;
class Publication{
    String title;
    int copies,price;
    void saleCopy(){
    }
}
class Book{
    String title,author;
    int copies,price;
    void saleCopy(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter price : ");
        price = in.nextInt();
        System.out.println("Total sale: "+copies*price);
    }
    void orderCopies(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. of copies : ");
        copies = in.nextInt();
    }
}
class Magazine{
    String title;
    int copies,price;
    void saleCopy(){
    }
    void orderQty(){
    }
    void currentIssue(){
    }
    void receiveIssue(){
    }
}
public class Polymorphism{
    public static void main(String args[]){
        Book b = new Book();
        b.orderCopies();
        b.saleCopy();
    }
}
