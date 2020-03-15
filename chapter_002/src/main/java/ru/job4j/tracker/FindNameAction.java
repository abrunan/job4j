package ru.job4j.tracker;

public class FindNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find an item by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println(this.name());
        String id = input.askString("Enter name of the item: ");
        Item[] items = tracker.findByName(id);
        if (items.length == 0) {
            System.out.println("No items with such name are found. Try again.");
        } else {
            for (Item current : items) {
                System.out.println(String.format("%s: %s", current.getId(), current.getName()));
            }
        }
        return true;
    }
}
