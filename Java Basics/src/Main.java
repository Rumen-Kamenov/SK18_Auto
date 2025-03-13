import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object for fied for username
        Scanner IntAge = new Scanner(System.in);  // Create a Scanner object for field age

        System.out.println("Enter username:"); // Print username text
        String userName = myObj.nextLine();  // Read user input for username

        System.out.println("Enter Age:");    // Print age text
        int age = IntAge.nextInt();         // Read user input for Age

        System.out.println("username is:" + userName);
        System.out.println("Age is:" + age);
    }
}