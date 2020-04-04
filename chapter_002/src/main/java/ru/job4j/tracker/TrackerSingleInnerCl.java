package ru.job4j.tracker;

public class TrackerSingleInnerCl {
    private TrackerSingleInnerCl() {
    }
    public static Tracker getInstance() {
        return Holder.INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    private static final class Holder {
        private static final Tracker INSTANCE = new Tracker();
    }
}
