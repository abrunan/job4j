package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;
public class MagicBall {
    public static void main(String[] args) {
        System.out.print("I am the great Oracle. What do you want to know? ");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.println("Yes");
        } else if (answer == 1) {
            System.out.println("No");
        } else {
            System.out.println("Maybe...");
        }
    }
}
