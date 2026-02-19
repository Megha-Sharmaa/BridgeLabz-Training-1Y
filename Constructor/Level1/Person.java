package com.GLA.Constructor.Level1;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("-----------------------------");
    }
}

class PersonCopyDemo {
    public static void main(String[] args) {
        Person original = new Person("Megha", 20);
        Person copy = new Person(original);

        original.displayDetails();
        copy.displayDetails();
    }
}