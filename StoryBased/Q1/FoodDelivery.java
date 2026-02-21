package com.GLA.StoryBased.Q1;

class Order {
    int orderId;
    double baseAmount;
    static double deliveryCharge = 40;

    Order(int orderId, double baseAmount) {
        this.orderId = orderId;
        this.baseAmount = baseAmount;
    }

    double calculateBill() {
        return baseAmount + deliveryCharge;
    }
}

class RegularOrder extends Order {
    RegularOrder(int orderId, double baseAmount) {
        super(orderId, baseAmount);
    }

    @Override
    double calculateBill() {
        // No discount
        return baseAmount + deliveryCharge;
    }
}

class PremiumOrder extends Order {
    PremiumOrder(int orderId, double baseAmount) {
        super(orderId, baseAmount);
    }

    @Override
    double calculateBill() {
        // 20% discount
        double discountedAmount = baseAmount * 0.8;
        return discountedAmount + deliveryCharge;
    }
}

public class FoodDelivery {
    public static void main(String[] args) {
        Order order1 = new RegularOrder(101, 500);
        Order order2 = new PremiumOrder(102, 500);

        System.out.println("Regular Order Bill: " + order1.calculateBill());
        System.out.println("Premium Order Bill: " + order2.calculateBill());
    }
}