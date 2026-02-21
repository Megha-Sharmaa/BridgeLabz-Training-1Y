package com.GLA.Package.Level1;

public class Base {
    public void publicMethod() {
        System.out.println("Public method in Base");
    }

    protected void protectedMethod() {
        System.out.println("Protected method in Base");
    }

    void defaultMethod() {
        System.out.println("Default (package-private) method in Base");
    }

    private void privateMethod() {
        System.out.println("Private method in Base");
    }
}