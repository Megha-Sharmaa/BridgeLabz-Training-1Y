package com.GLA.ClassObjects.Level1;

import java.util.Scanner;

class Item {
    private int itemCode;
    private String itemName;
    private double price;

    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}


class ItemInventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Item item1 = new Item(101, "Laptop", 45000);
        Item item2 = new Item(102, "Phone", 25000);

        item1.displayDetails();
        System.out.print("Enter quantity for Laptop: ");
        int qty1 = sc.nextInt();
        System.out.println("Total Cost: " + item1.calculateTotalCost(qty1));
        System.out.println("-----------------------------");

        item2.displayDetails();
        System.out.print("Enter quantity for Phone: ");
        int qty2 = sc.nextInt();
        System.out.println("Total Cost: " + item2.calculateTotalCost(qty2));
        System.out.println("-----------------------------");

        sc.close();
    }
}