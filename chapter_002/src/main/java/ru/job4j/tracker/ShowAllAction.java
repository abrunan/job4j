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
            System.out.printf("Item: %s\t\t\tid: %s", current.getName(), current.getId());
            System.out.println();
        }
        return true;
    }
}
