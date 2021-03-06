package edu.Bootcamp;

public class Book {
    String title;
    boolean borrowed;

    public Book(String bookTitle) {
        this.title = bookTitle;
        this.borrowed = false;
    }

    public String toString() {
        return "book{title='" + this.title + "', borrowed=" + this.borrowed + "}";
    }

    public void borrowed() {
        this.borrowed = true;
    }

    public void returned() {
        this.borrowed = false;
    }

    public boolean isBorrowed() {
        return this.borrowed;
    }

    public String getTitle() {
        return this.title;
    }

    public static void main(String[] arguments) {
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.borrowed();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }
}
