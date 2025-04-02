package DataStructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class dynamicHashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer,String>DynamicMap = new HashMap<>();

        System.out.println("Number of entries for HashMap..");
        int n = scanner.nextInt();

        for(int i = 0;i < n; i++){
            System.out.println("Enter key(Integer): ");
            int key = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter value (String): ");
            String value = scanner.nextLine();

            DynamicMap.put(key,value); // Storing key-values from user input

        }
        System.out.println("Stored HashMap is: " );
        DynamicMap.forEach((key, value) -> System.out.println(key + " -> " + value));

        scanner.close();
    }
}
