package edu.Bootcamp;

import java.util.*;


public class Library {
    String libraryAddress;
    ArrayList<Book> books;

    public Library(String address1) {
        libraryAddress = address1;
        books = new ArrayList<Book>();
    }

    public void addBook(Book book1) {
        books.add(book1);
    }

    public void printAddress() {
        System.out.println(libraryAddress);
    }

    public void printAvailableBooks() {
        Book libraryBook;
        boolean libraryIsEmpty = true;

        for ( int index1 = 0; index1 < books.size(); index1++ ) {
            libraryBook = books.get(index1);
            if ( ! ( libraryBook.isBorrowed() ) ) {
                System.out.println( libraryBook.getTitle() );
                libraryIsEmpty = false;
            }
        } if ( libraryIsEmpty ) {
            System.out.println("Sorry, our catalog is empty at the moment.");
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
                    System.out.println("Sorry, " + bookTitle1 + "is already borrowed.");
                }
                return null;
            }
        }
        System.out.println("Sorry, this book is not in our catalog.");
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
                    System.out.println("Are you sure you got the book from here? It isn't in our system.");
                }
            }
        }
        System.out.println();
        return null;
    }
}