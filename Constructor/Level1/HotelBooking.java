package com.GLA.Constructor.Level1;

class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public void displayDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.println("-----------------------------");
    }
}

class HotelBookingDemo {
    public static void main(String[] args) {
        HotelBooking defaultBooking = new HotelBooking();
        HotelBooking paramBooking = new HotelBooking("Megha", "Deluxe", 3);
        HotelBooking copyBooking = new HotelBooking(paramBooking);

        defaultBooking.displayDetails();
        paramBooking.displayDetails();
        copyBooking.displayDetails();
    }
}