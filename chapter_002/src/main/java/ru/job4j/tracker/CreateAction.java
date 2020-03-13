package ru.job4j.tracker;

public class CreateAction implements UserAction {
    @Override
    public String name() {
        return "=== Create a new item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println(this.name());
        String name = input.askString("Enter a name for a new item: ");
        tracker.add(new Item(name));
        return true;
    }
}
