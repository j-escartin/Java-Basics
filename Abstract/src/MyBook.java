/**
 * created by Acer on 4/3/23
 **/
public class MyBook extends Book {

    private String title;
    private String author;
    private int price;

    public MyBook(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
