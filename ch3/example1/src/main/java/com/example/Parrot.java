package com.example;

public class Parrot {
    private String name;

    public Parrot() {
        System.out.println("parrot created");
    }

    @Override
    public String toString() {
        return "Parrot: " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
