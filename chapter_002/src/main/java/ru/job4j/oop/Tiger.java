package ru.job4j.oop;

public class Tiger extends Predator {
    public Tiger() {
        super();
        System.out.println("Tiger constructor...");
    }

    public Tiger(String name) {
        super(name);
        System.out.println("Predator constructor  with parameter...");
    }

}
