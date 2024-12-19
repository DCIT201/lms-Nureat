package org.example;
import java.util.List;
import java.util.ArrayList;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Success");
    }

    public void showbooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
