package com.GLA.ClassObjects.Level2;

class Student {
    private String name;
    private int rollNumber;
    private double marks;

    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String calculateGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 75) return "A";
        else if (marks >= 60) return "B";
        else if (marks >= 45) return "C";
        else return "F";
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println("-----------------------------");
    }
}

class StudentReport {
    public static void main(String[] args) {
        Student s1 = new Student("Megha", 101, 92);
        Student s2 = new Student("Rahul", 102, 76);
        Student s3 = new Student("Ananya", 103, 58);

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}