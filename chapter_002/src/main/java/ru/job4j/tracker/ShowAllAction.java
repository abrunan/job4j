package ru.job4j.tracker;

public class ShowAllAction implements UserAction {
    @Override
    public String name() {
        return "=== Show all items === ";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println(this.name());
        for (Item current : tracker.findAll()) {
            System.out.println(String.format("%s: %s", current.getId(), current.getName()));
        }
        return true;
    }
}
