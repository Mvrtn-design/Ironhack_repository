package com.example.Lab5;

public class Book_exc_1 {
    private String title;
    private String author;
    private int pages;

    public Book_exc_1(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void readBook() {
        System.out.println("Reading [" + title + "]  by [" + author + "]");
    }
}
