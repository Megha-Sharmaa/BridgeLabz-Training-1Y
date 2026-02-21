package com.GLA.Package.Level1;

public class Faculty {
    private String name;
    private String subject;

    public Faculty(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void displayFacultyDetails() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Subject: " + subject);
    }
}