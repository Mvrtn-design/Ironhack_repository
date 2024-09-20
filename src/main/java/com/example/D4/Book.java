package com.example.D4;

public class Book extends Item {

    String isbn;
    String gender;

    public Book(String title, String author, int publicationYear, String isbn, String gender) {
        super(title, author, publicationYear);
        this.isbn = isbn;
        this.gender = gender;
    }

    public void borrowItem() {
        System.out.println("You have borrowed a book");
    }

    public void borrowItem(String borrowerName) {
        System.out.println(borrowerName + " has borrowed a book");
    }

    @Override
    public String getDetails() {
        return "Details of the book: " + isbn + " " + gender + "";
    }

}
