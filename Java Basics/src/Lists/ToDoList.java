package Lists;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Add initial tasks to the list
        toDoList.add("Buy groceries");
        toDoList.add("Clean the house");
        toDoList.add("Finish homework");

        // Display all tasks with their index
        System.out.println("To-Do List: ");
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println(i + ": " + toDoList.get(i));
        }

        // Prompt user to mark a task as completed
        System.out.print("Enter the index of the completed task: ");
        int index = scanner.nextInt();

        // Check if the index is valid and remove the task
        if (index >= 0 && index < toDoList.size()) {
            toDoList.remove(index);
            System.out.println("Task removed successfully.");

            System.out.println("Updated To-Do List:");
            for (int i = 0; i < toDoList.size(); i++) {
                System.out.println(i + ": " + toDoList.get(i));
            }
        } else {
            System.out.println("Invalid index. No task was removed.");
        }
    }
}
