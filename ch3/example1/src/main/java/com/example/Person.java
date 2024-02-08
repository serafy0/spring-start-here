package com.example;

import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name = "Ella";

    private Parrot parrot;

    public Person(Parrot parrot2) {
        this.parrot = parrot2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    public void setParrot(Parrot parrot2) {
        this.parrot = parrot2;
    }

}
