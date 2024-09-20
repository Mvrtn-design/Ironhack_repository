package com.example.D4;

public class Item {
    String title;
    String author;
    int publicationYear;


    public Item(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getDetails() {
        return "Title: " + title + "\nAuthor: " + author + "\nPublication Year: " + publicationYear;
    }
}
