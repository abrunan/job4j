package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.parseInt(scanner.nextLine());
            if(select == 0) {
                System.out.println("=== Create a new item ===");
                System.out.print("Enter a name for a new item: ");
                String name = scanner.nextLine();
                tracker.add(new Item(name));
            } else if (select == 1) {
                showItems(tracker);
            } else if (select == 2) {
                System.out.println("=== Edit an item ===");
                System.out.print("Enter id of the item to de edited: ");
                String id = scanner.nextLine();
                System.out.print("Enter the new name for the item: ");
                String name = scanner.nextLine();
                if (tracker.replace(id, new Item(name))) {
                    System.out.println("Edited successfully!");
                } else {
                    System.out.println("Invalid id or name... Item couldn't be edited.");
                }
                showItems(tracker);
            } else if (select == 3) {
                System.out.println("=== Delete an item ===");
                System.out.print("Enter id of the item to de deleted: ");
                String id = scanner.nextLine();
                if (tracker.delete(id)) {
                    System.out.println("Deleted successfully!");
                } else {
                    System.out.println("Invalid id, item couldn't be deleted...");
                }
                showItems(tracker);
            } else if (select == 4) {
                System.out.println("=== Find an item by id ===");
                System.out.print("Enter id of the item: ");
                String id = scanner.nextLine();
                Item item = tracker.findById(id);
                if (item == null) {
                    System.out.println("Item with such id is not found. Try again.");
                } else {
                    System.out.printf("Item is found: %s", item.getName());
                    System.out.println();
                }
            } else if (select == 5) {
                System.out.println("=== Find an item by name ===");
                System.out.print("Enter name of the item: ");
                String id = scanner.nextLine();
                Item[] items = tracker.findByName(id);
                if (items == null || items.length == 0) {
                    System.out.println("No item with such name is found. Try again.");
                } else {
                    System.out.println("Items found:");
                    for (Item item : items) {
                        System.out.printf("%s\t\t\t%s", item.getName(), item.getId());
                        System.out.println();
                    }
                }
            } else if (select == 6) {
                System.out.println("Exiting program...");
                run = false;
            } else {
                System.out.println("Invalid number. Returning to menu...");
            }
        }
    }

    private void showItems(Tracker tracker) {
        Item[] all = tracker.findAll();
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
        System.out.print("Select: ");
    }

    public static void main(String[] args) {
        String ls = System.lineSeparator();
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
