import java.util.*;

class Book2 {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    public Book2(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Sorry, this book is already borrowed.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("Book returned successfully!");
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    public static void main(String[] args) {
        Book2 b1 = new Book2("Java Basics", "Mark Johnson", 399.99);

        b1.displayDetails();
        b1.borrowBook();
        b1.displayDetails();
        b1.returnBook();
        b1.displayDetails();
    }
}
