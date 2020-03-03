package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void ride() {
        System.out.println("The ride goes on!");
    }

    @Override
    public void passengers(int quantity) {
        System.out.println(quantity + " passengers entered.");
    }

    @Override
    public int fillTank(int gas) {
        return 0;
    }
}
