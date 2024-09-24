package com.example.Week1.D4;

import java.util.ArrayList;

public class Library {
    ArrayList<Item> myLibrary;

    Library(){
        myLibrary = new ArrayList<>();
    }
    

    public void addItem(Item item) {
        myLibrary.add(item);
    }

    public void removeItem(Item item) {
        myLibrary.remove(item);
    }

    public void displayItems() {
        for (Item item : myLibrary) {
            System.out.println("- " + item.getDetails());
        }
    }
}
