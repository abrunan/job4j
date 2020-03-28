package ru.job4j.tracker;

public class StubInput implements Input {
    private String[] answers;
    private int position;

    public StubInput(String[] answers) {
        this.answers = answers;
    }

    @Override
    public String askString(String message) {
        return answers[position++];
    }

    @Override
    public int askInt(String message) {
        return Integer.parseInt(askString(message));
    }

    @Override
    public int askInt(String message, int max) {
        return askInt(message);
    }
}
