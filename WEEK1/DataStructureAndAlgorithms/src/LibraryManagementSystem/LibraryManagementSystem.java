package LibraryManagementSystem;

import java.util.LinkedList;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        LinkedList<String> books = new LinkedList<>();

        books.add("Java Programming");
        books.add("Data Structures");
        books.add("Algorithms");

        System.out.println("Library Books:");
        for (String book : books) {
            System.out.println(book);
        }
    }
}