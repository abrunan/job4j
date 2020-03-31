package ru.job4j.tracker;


import java.util.Scanner;

public class ConsoleInput implements Input {
    Scanner scanner = new Scanner(System.in);

    @Override
    public String askString(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    @Override
    public int askInt(String message) {
        return Integer.parseInt(askString(message));
    }

    @Override
    public int askInt(String message, int max) {
        int select = askInt(message);
        if (select < 0 || select > max) {
            throw new IllegalStateException(String.format("Out of bounds: %s is not in [0, %s]", select, max));
        }
        return select;
    }
}
