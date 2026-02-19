package com.GLA.ClassObjects.Level1;

class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("-----------------------------");
    }
}

class EmployeeDetails {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 101, 50000);
        Employee emp2 = new Employee("Bob", 102, 60000);
        Employee emp3 = new Employee("Charlie", 103, 55000);

        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }
}