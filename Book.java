/**
 *
 */
package library;

//Author: G. Allen Johnson 
//Midterm Project - Part 3
//Class: CS 17.11 - D. Pearson
//Version: 1.3

public class Book {

    private String title;
    private boolean borrowed;

    /**
     * Creates a new Book
     * 
     * @param bookTitle
     */
    public Book(String bookTitle) {
        this.title = bookTitle;
    }

    /**
     * Marks the book as borrowed
     */
    public void checkOut() {
        this.borrowed = true;
    }

    /**
     * Marks the book as not borrowed
     */
    public void checkIn() {
        this.borrowed = false;
    }

    /**
     * Returns true if the book is borrowed, false otherwise
     * 
     * @return
     */
    public boolean isBorrowed() {

        return borrowed;
    }

    /**
     * Returns the title of the book
     * 
     * @return
     */
    public String getTitle() {

        return title;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     */

    public boolean equals(Book book) {
        if (this.title == book.getTitle()) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        return title;
    }

    /**
     * a quick test to make sure that the Book methods are implemented correctly
     * 
     * @param arguments
     */
    // public static void main(String[] arguments) {
    // Book example = new Book("The Da Vinci Code");
    // System.out.println("Title (should be The Da Vinci Code): "
    // + example.getTitle());
    // System.out.println("Borrowed? (should be false): "
    // + example.isBorrowed());
    // example.checkOut();
    // System.out.println("Borrowed? (should be true): "
    // + example.isBorrowed());
    // example.checkIn();
    // System.out.println("Borrowed? (should be false): "
    // + example.isBorrowed());
    //
    // System.out.println("equal? (should be true): "
    // + example.equals(example));
    // Book example2 = new Book("A Dance with Dragons");
    // System.out.println("equal? (should be false): "
    // + example.equals(example2));
    //
    // }
}
