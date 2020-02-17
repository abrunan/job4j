package ru.job4j.tracker;

public class Predator extends Animal {
    public Predator() {
        super();
        System.out.println("Predator constructor...");
    }
    public Predator(String name) {
        super(name);
        System.out.println("Predator constructor with parameter...");
    }

}
