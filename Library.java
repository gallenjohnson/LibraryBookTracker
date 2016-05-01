/**
 *
 */
package library;

import java.util.ArrayList;
import java.util.List;

//Author: G. Allen Johnson 
//Midterm Project - Part 3
//Class: CS 17.11 - D. Pearson
//Version: 1.7

public class Library {
    private String address;
    private List<Book> inventory;

    public Library(String location) {
        this.address = location;
        this.inventory = new ArrayList<Book>();

    }

    public void addBook(Book book) {
        inventory.add(book);

    }

    public static void printOpeningHours() {
        System.out.println("Libraries are open daily from 9am to 5pm.");

    }

    public void printAddress() {
        System.out.println(address);
    }

    public void borrowBook(String b) {
        int i = 0;
        boolean state = false;
        String checkBook = b;
        String bookInv;

        while (i < (inventory.size())) {
            bookInv = (inventory.get(i).getTitle());
            if (bookInv.equals(checkBook)) {
                if (!inventory.get(i).isBorrowed()) {
                    System.out
                            .println("You successfully borrowed " + checkBook);
                    inventory.get(i).checkOut();
                    state = true;
                    break;
                }
                if (inventory.get(i).isBorrowed()) {
                    System.out.println("Sorry, this book is already borrowed.");
                    state = true;
                    break;
                }
            }
            i++;
        }
        if (state == false) {
            System.out.println("Sorry, this book is not in our catalog.");
        }
    }

    public void printAvailableBooks() {
        int count = 0;

        if (inventory.size() < 1) {
            System.out.println("No book in catalog");

            return;
        }

        while (count < inventory.size()) {
            if (inventory.get(count).isBorrowed()) {
                System.out.print("");
                count++;
            } else {
                System.out.println(inventory.get(count));
                count++;

            }
        }

    }

    public void returnBook(String b) {
        int i = 0;
        String checkBook = b;
        String bookInv;
        while (i < (inventory.size())) {
            bookInv = (inventory.get(i).getTitle());
            if (bookInv.equals(checkBook)) {
                System.out.println("You successfully returned " + checkBook);
                inventory.get(i).checkIn();
                break;
            }
            i++;
        }

    }

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();
        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();

    }
}
