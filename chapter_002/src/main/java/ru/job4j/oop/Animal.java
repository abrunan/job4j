package ru.job4j.oop;

public class Animal {
    private String name;

    public Animal() {
        super();
        System.out.println("Animal constructor...");
    }

    public Animal(String name) {
        super();
        this.name = name;
        System.out.println("Animal constructor with parameter...");
    }
}
