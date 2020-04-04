package ru.job4j.tracker;

public class TrackerSingleSF {
    private static Tracker instance;

    private TrackerSingleSF() {
    }

    public static Tracker getInstance() {
        if (instance == null) {
            instance = new Tracker();
        }
        return instance;
    }
}
