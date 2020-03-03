package ru.job4j.oop.college;

public class College {
    public static void main(String[] args) {
        Freshman harry = new Freshman();
        Student potter = harry;
        Object drako = potter;
    }
}
