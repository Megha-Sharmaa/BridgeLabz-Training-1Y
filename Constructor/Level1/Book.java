package com.GLA.Constructor.Level1;

class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("-----------------------------");
    }
}


class BookClassDemo {
    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book paramBook = new Book("The Alchemist", "Paulo Coelho", 499);

        defaultBook.displayDetails();
        paramBook.displayDetails();
    }
}