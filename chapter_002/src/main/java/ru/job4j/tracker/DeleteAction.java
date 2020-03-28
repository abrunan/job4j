package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete an item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println(this.name());
        String id = input.askString("Enter id of the item to de deleted: ");
        if (tracker.delete(id)) {
            System.out.println("Deleted successfully!");
        } else {
            System.out.println("Invalid id, item couldn't be deleted.");
        }
        return true;
    }
}
