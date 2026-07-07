package InventoryManagementSystem;

import java.util.HashSet;
import java.util.Set;

public class InventoryManagementSystem {

    public static void main(String[] args) {
        Set<String> inventory = new HashSet<>();

        inventory.add("Laptop");
        inventory.add("Mouse");
        inventory.add("Keyboard");

        System.out.println("Inventory Items:");
        for (String item : inventory) {
            System.out.println(item);
        }
    }
}