package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "=== Edit an item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println(this.name());
        String id = input.askString("Enter id of the item to de edited: ");
        String name = input.askString("Enter new name for the item: ");
        if (tracker.replace(id, new Item(name))) {
            System.out.println("Edited successfully!");
        } else {
            System.out.println("Invalid id, item couldn't be edited.");
        }
        return true;
    }
}

