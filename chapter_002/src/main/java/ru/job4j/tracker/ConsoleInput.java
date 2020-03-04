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
}
