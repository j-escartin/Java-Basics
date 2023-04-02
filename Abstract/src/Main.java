import java.util.Scanner;

/**
 * created by James Vincent Escartin on 4/3/23
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input Title
        String title = scanner.nextLine();

        //Input Author
        String author = scanner.nextLine();

        //Input Price
        int price = scanner.nextInt();

        //Call the MyBook Class
        MyBook myBook = new MyBook(title, author, price);

        //Display the details of the book
        myBook.display();
    }
}
