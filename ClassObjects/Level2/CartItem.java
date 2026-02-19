package com.GLA.ClassObjects.Level2;

import java.util.ArrayList;
import java.util.Scanner;

class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getTotalCost() {
        return price * quantity;
    }

    public void displayItem() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity + ", Total: " + getTotalCost());
    }
}

class ShoppingCart {
    private ArrayList<CartItem> cart = new ArrayList<>();

    public void addItem(String name, double price, int quantity) {
        cart.add(new CartItem(name, price, quantity));
        System.out.println(name + " added to cart.");
    }

    public void removeItem(String name) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).getItemName().equalsIgnoreCase(name)) {
                cart.remove(i);
                System.out.println(name + " removed from cart.");
                return;
            }
        }
        System.out.println("Item not found in cart.");
    }

    public void displayTotalCost() {
        double total = 0;
        for (CartItem item : cart) {
            item.displayItem();
            total += item.getTotalCost();
        }
        System.out.println("Total Cart Cost: " + total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Laptop", 45000, 1);
        cart.addItem("Phone", 25000, 2);
        cart.addItem("Headphones", 2000, 3);

        cart.displayTotalCost();

        System.out.print("Enter item to remove: ");
        String removeItem = sc.nextLine();
        cart.removeItem(removeItem);

        cart.displayTotalCost();

        sc.close();
    }
}