package EmployeeManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class EmployeeManagementSystem {

    public static void main(String[] args) {
        Map<Integer, String> employees = new HashMap<>();

        employees.put(101, "Alice");
        employees.put(102, "Bob");
        employees.put(103, "Charlie");

        System.out.println("Employee Details:");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
