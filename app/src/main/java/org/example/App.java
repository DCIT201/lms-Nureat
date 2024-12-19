/*
 * This should be your main class where all your objects will be created
 */
package org.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Patron is: " + new Patron("Nureat Ahmed Sey"));
        Library library = new Library();

        Book firstBook = new Book("Wickedness", "Sey", 2000);
        Book secondBook = new Book("Love", "Sowah", 1999);

        library.addBook(firstBook);
        library.addBook(secondBook);

        library.showbooks();

    }
}
