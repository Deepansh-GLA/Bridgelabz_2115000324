import java.util.*;

class Booklib {
    public String ISBN;
    protected String title;
    private String author;

    public Booklib(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static void main(String[] args) {
        Booklib b1 = new Booklib("123-456789", "Java for Beginners", "Mark Smith");
        System.out.println("Book Title: " + b1.title);
        System.out.println("Book Author: " + b1.getAuthor());
    }
}
