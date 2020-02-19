package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book shildt = new Book("Java. The Complete Reference", 1882);
        Book martin = new Book("Clean Code", 464);
        Book sierra = new Book("Head First Java", 660);
        Book horstmann = new Book("Core Java", 864);

        Book[] books = new Book[]{shildt, martin, sierra, horstmann};

        for (int i = 0; i < books.length; i++) {
            Book boo = books[i];
            System.out.println(boo.getName() + " - " + boo.getPages() + " pages...");
        }

        System.out.println("Switch 0 and 3 indexes:");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            Book boo = books[i];
            System.out.println(boo.getName() + " - " + boo.getPages() + " pages...");
        }

        System.out.println("The specific book:");
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean Code")) {
                System.out.println(books[i].getName() + " - " + books[i].getPages() + " pages...");
            }
        }
    }
}
