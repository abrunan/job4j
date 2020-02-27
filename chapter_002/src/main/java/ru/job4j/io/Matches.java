package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int left = 11;
        int player = 0;
        while (left > 0) {
            System.out.println("\nThere are " + left + " matches at the table."
                    + "\nPlayer " + (player % 2 + 1) + ". How many matches do you wish to pull?");
            int pulled = Integer.parseInt(input.nextLine());
            boolean valid = (pulled > 0 && pulled < 4 && pulled <= left);
            if (!valid) {
                System.out.println("Invalid quantity");
            } else {
                left -= pulled;
                if (left > 0) {
                    player++;
                }
            }
        }
        System.out.println("Player " + (player % 2 + 1) + " wins! Congratulations!");
    }
}
