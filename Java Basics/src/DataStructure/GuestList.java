package DataStructure;

import java.util.HashMap;
import java.util.HashSet;

public class GuestList {
    public static void main(String[] args) {
        HashSet<String> GuestList = new HashSet<>();

        GuestList.add("Peso");
        GuestList.add("Gosho");
        GuestList.add("Mitko");

        boolean isAdded = GuestList.add("Peso");
        System.out.println("\nTrying to add Peso again: " + (isAdded ? "Added" : "Already on the list"));

        GuestList.remove("Gosho");
        System.out.println("\nGosho can't attend. Updated Guest List: " + GuestList);

       boolean isOnTheList =  GuestList.contains("Mitko");
       System.out.println("\nIs Mitko on the guest list? " + (isOnTheList ? "Yes!" : "No!"));

        System.out.println("\nFinal guest list is :"+ GuestList);
    }
}
