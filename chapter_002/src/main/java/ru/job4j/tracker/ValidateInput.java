package ru.job4j.tracker;

public class ValidateInput extends ConsoleInput {

    @Override
    public int askInt(String message, int max) {
        boolean invalid = true;
        int res = -1;
        do {
            try {
                res = super.askInt(message, max);
                invalid = false;
            } catch (IllegalStateException ise) {
                System.out.println("The number is out of bounds. Please enter again.");
                ;
            } catch (NumberFormatException nfe) {
                System.out.println("It is not a number. Please enter again.");
            }
        } while (invalid);
        return res;
    }

    @Override
    public int askInt(String message) {
        boolean invalid = true;
        int res = -1;
        do {
            try {
                res = super.askInt(message);
                invalid = false;
            } catch (NumberFormatException nfe) {
                System.out.println("It is not a number. Please enter again.");
            }
        } while (invalid);
        return res;
    }
}