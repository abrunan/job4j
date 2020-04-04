package ru.job4j.tracker;

public class TrackerSingleSFF {
    private static final Tracker INSTANCE = new Tracker();

    private TrackerSingleSFF() {
    }

    public static Tracker getInstance() {
        return INSTANCE;
    }
}
