package com.GLA.ClassObjects.Level1;

class MobilePhone {
    private String brand;
    private String model;
    private double price;

    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("-----------------------------");
    }
}

class MobilePhoneDetails {
    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Apple", "iPhone 15", 79999);
        MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S24", 69999);
        MobilePhone phone3 = new MobilePhone("OnePlus", "12 Pro", 55999);

        phone1.displayDetails();
        phone2.displayDetails();
        phone3.displayDetails();
    }
}