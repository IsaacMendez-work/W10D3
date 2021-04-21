package edu.Bootcamp;

import java.util.ArrayList;

public class Library {
    String libraryAddress;
    ArrayList<Book> books;

    public Library(String address) {
        this.libraryAddress = address;
//        this.books = new ArrayList<Book>();
        this.books = new ArrayList();
    }

    public void addBook(Book book1) {
        this.books.add(book1);
    }

    public void printAddress() {
        System.out.println(this.libraryAddress);
    }

    public void printAvailableBooks() {
        boolean libraryIsEmpty = true;
        for ( int index2 = 0; index2 < this.books.size(); ++index2) {
            Book libraryBook = (Book)this.books.get(index2);
            if (!libraryBook.isBorrowed()) {
                System.out.println(libraryBook.getTitle());
                libraryIsEmpty = false;
            }
        } if (libraryIsEmpty) {
            System.out.println("Sorry, our catalog is empty.");
        }
    }

    public String borrowBook(String title2) {
        Book book1;
        String bookTitle1;
        for( int index2 = 0; index2 < books.size(); index2++ ) {
            book1 = books.get(index2);
            bookTitle1 = book1.getTitle();
            if ( bookTitle1.equals(title2) ) {
                if ( ! (book1.isBorrowed() ) ) {
                    book1.borrowed();
                    System.out.println("You have successfully borrowed " + bookTitle1 + ".");
                } else {
                    System.out.println("Sorry, " + bookTitle1 + " is already borrowed.");
                }
                return null;
            }
        }
        System.out.println("This book is not in our catalog.");
        return null;
    }

    public String returnBook(String input1) {
        Book book2;
        String title2;
        boolean found1 = false;

        for (int index3 = 0; index3 < books.size(); index3++) {
            book2 = books.get(index3);
            title2 = book2.getTitle();
            if (title2.equals(input1)) {
                if ( book2.isBorrowed() ) {
                    book2.returned();
                    System.out.println("You successfully returned " + title2 + "!");
                    found1 = true; break;
                }
                else {
                    System.out.println("This book doesn't appear to be in our system.");
                }
            }
        }
        return null;
    }
}