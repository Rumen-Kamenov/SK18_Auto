package Lists;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Size of the List: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume next line

        // Using for loop to add elements dynamically
        for (int i = 0; i < n; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            list.add(scanner.nextLine());    // add dynamically items to arrayList
        }
        if(list.size() == n){
            System.out.println("Completed Tasks");
            System.out.println("_______________");
        }
        System.out.println(".");

        // Display the list
        System.out.print("Items in the list:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+",");
        }

        scanner.close();
    }
}
