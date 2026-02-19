package com.GLA.ClassObjects.Level2;

import java.util.Scanner;

class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;

    public MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully for " + movieName);
    }

    public void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
        System.out.println("-----------------------------");
    }
}

class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MovieTicket ticket = new MovieTicket("Inception", "A1", 250);

        ticket.displayDetails();

        System.out.print("Enter new seat number: ");
        String newSeat = sc.nextLine();
        System.out.print("Enter new price: ");
        double newPrice = sc.nextDouble();

        ticket.bookTicket(newSeat, newPrice);
        ticket.displayDetails();

        sc.close();
    }
}

