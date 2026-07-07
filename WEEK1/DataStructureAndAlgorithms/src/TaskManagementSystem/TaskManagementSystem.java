package TaskManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class TaskManagementSystem {

    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();

        tasks.add("Design Database");
        tasks.add("Implement Backend");
        tasks.add("Test Application");

        System.out.println("Task List:");
        for (String task : tasks) {
            System.out.println("- " + task);
        }
    }
}
