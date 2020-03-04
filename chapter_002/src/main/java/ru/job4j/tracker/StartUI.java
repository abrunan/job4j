package ru.job4j.tracker;

public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if(select == 0) {
                System.out.println("=== Create a new item ===");
                String name = input.askString("Enter a name for a new item: ");
                tracker.add(new Item(name));
            } else if (select == 1) {
                showItems(tracker.findAll());
            } else if (select == 2) {
                System.out.println("=== Edit an item ===");
                String id = input.askString("Enter id of the item to de edited: ");
                String name = input.askString("Enter the new name for the item: ");
                if (tracker.replace(id, new Item(name))) {
                    System.out.println("Edited successfully!");
                } else {
                    System.out.println("Invalid id or name... Item couldn't be edited.");
                }
                showItems(tracker.findAll());
            } else if (select == 3) {
                System.out.println("=== Delete an item ===");
                String id = input.askString("Enter id of the item to de deleted: ");
                if (tracker.delete(id)) {
                    System.out.println("Deleted successfully!");
                } else {
                    System.out.println("Invalid id, item couldn't be deleted...");
                }
                showItems(tracker.findAll());
            } else if (select == 4) {
                System.out.println("=== Find an item by id ===");
                String id = input.askString("Enter id of the item: ");
                Item item = tracker.findById(id);
                if (item == null) {
                    System.out.println("Item with such id is not found. Try again.");
                } else {
                    System.out.printf("Item is found: %s", item.getName());
                    System.out.println();
                }
            } else if (select == 5) {
                System.out.println("=== Find an item by name ===");
                String id = input.askString("Enter name of the item: ");
                Item[] items = tracker.findByName(id);
                if (items == null || items.length == 0) {
                    System.out.println("No item with such name is found. Try again.");
                } else {
                    System.out.println("Items found:");
                    showItems(items);
                }
            } else if (select == 6) {
                System.out.println("Exiting program...");
                run = false;
            } else {
                System.out.println("Invalid number. Returning to menu...");
            }
        }
    }

    private void showItems(Item[] all) {
        for (int i = 0; i < all.length; i++) {
            Item current = all[i];
            System.out.printf("Item: %s\t\t\tid: %s", current.getName(), current.getId());
            System.out.println();
        }
    }

    private void showMenu() {
        String ls = System.lineSeparator();
        System.out.println("Menu:");
        System.out.println("0. Add new Item" + ls +
                "1. Show all items" + ls +
                "2. Edit item" + ls +
                "3. Delete item" + ls +
                "4. Find item by Id" + ls +
                "5. Find item by name" + ls +
                "6. Exit Program");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
