package com.GLA.Constructor.Level1;

class Circle {
    private double radius;

    public Circle() {
        this(1.0); // default radius using constructor chaining
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + (Math.PI * radius * radius));
        System.out.println("Circumference: " + (2 * Math.PI * radius));
        System.out.println("-----------------------------");
    }
}

class CircleChainingDemo {
    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        Circle customCircle = new Circle(5.5);

        defaultCircle.displayDetails();
        customCircle.displayDetails();
    }
}