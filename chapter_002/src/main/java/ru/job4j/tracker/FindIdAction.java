package ru.job4j.tracker;

public class FindIdAction implements UserAction {
    @Override
    public String name() {
        return "=== Find an item by id ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println(this.name());
        String id = input.askString("Enter id of the item: ");
        Item item = tracker.findById(id);
        if (item == null) {
            System.out.println("Item with such id is not found. Try again.");
        } else {
            System.out.printf("Item is found: %s", item.getName());
        }
        System.out.println();
        return true;
    }
}
