package org.example;

public class Book {

    // This is your working class.
    private String label;
    private String writer;
    private int year;

    public Book(String title, String author, int makeYear) {
        label = title;
        writer = author;
        year = makeYear;
    }

    public void setLabel(String title) {
        label = title;
    }

    public void setWriter(String author) {
        writer = author;
    }

    public void setYear(int makeYear) {
        year = makeYear;
    }

    public String getLabel() {
        return label;
    }

    public String getWriter() {
        return writer;
    }

    public int getYear() {
        return year;
    }
    
}
