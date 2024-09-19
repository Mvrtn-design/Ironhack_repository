package com.example.Lab5;

public class Magazine extends Item {
    int issueNumber;
    int monthPublished;

    public Magazine(String title, String author, int publicationYear, int issueNumber, int monthPublished) {
        super(title, author, publicationYear);
        this.issueNumber = issueNumber;
        this.monthPublished = monthPublished;
    }

    @Override
    public String getDetails() {
        return "Details of the magazine: " + issueNumber + " Issue, published in " + monthPublished + "";
    }
}
