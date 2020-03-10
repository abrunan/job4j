package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public static void main(String[] args) {
        Battery first = new Battery(10);
        Battery second = new Battery(15);
        System.out.println(first.load + " " + second.load);
        first.exchange(second);
        System.out.println(first.load + " " + second.load);
    }

    private void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }
}
