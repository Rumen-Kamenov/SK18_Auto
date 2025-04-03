package DataStructure;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleContactList {
    public static void main(String[] args) {
        ArrayList<String>contactList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        contactList.add("08986394783");
        contactList.add("0898632321312");
        contactList.add("089863232131243");
        contactList.add("089988877665");
        contactList.add("089811111111");
        contactList.add("089833333333");

        // Print Contact List //
        System.out.println("Contact List:");
        for(int i = 0; i < contactList.size();i++){
            System.out.println((i+1)+ ": " + contactList.get(i));
        }
        // Ask user to enter the position of the contact they want to remove
        System.out.print("Enter the position of the contact to remove (1-" + contactList.size() + "): ");
        int position = scanner.nextInt() - 1; // Adjust for zero-based index

        // Check if the position is valid and remove the contact
        if (position >= 0 && position < contactList.size()) {
            String removedContact = contactList.remove(position);
            System.out.println("Removed contact: " + removedContact);

            System.out.println("Updated Contact List:");
            for (int i = 0; i < contactList.size(); i++) {
                System.out.println((i + 1) + ": " + contactList.get(i));
            }
        } else {
            System.out.println("Invalid position. No contact was removed.");
        }
    }
}
