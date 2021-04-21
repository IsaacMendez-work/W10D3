package edu.Bootcamp;

public class Main {

    // Method for library hours
    public static void printOpeningHours() {
        System.out.println("Libraries are open daily from 09 to 17.");
    }


    public static void main(String[] args) {
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        System.out.println("\nLibrary hours:");
        printOpeningHours();

        System.out.println("\nLibrary addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();

        System.out.println("\nBorrowing LotR:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");

        System.out.println("\nBooks available in the first library:");
        firstLibrary.printAvailableBooks();

        System.out.println("\nBooks available in the second library:");
        secondLibrary.printAvailableBooks();

        System.out.println("\nReturning LotR:");
        firstLibrary.returnBook("The Lord of the Rings");

        System.out.println("\nBooks available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}