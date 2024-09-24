package com.example.Week1.D4;

public class DVD extends Item {
    double duration;
    int rating;

    public DVD(String title, String author, int publicationYear, double duration, int rating) {
        super(title, author, publicationYear);
        this.duration = duration;
        this.rating = rating;
    }

    @Override
    public String getDetails() {
        return "Details  of DVD:" + duration + " " + rating + "";
    }
}
