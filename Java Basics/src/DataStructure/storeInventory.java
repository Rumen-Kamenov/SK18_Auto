package DataStructure;

import java.util.HashMap;
import java.util.Map;

public class storeInventory {
    public static void main(String[] args) {

        HashMap<String,Integer> inventory = new HashMap<>();
        inventory.put("Bread", 3);
        inventory.put("Cheese", 7);
        inventory.put("Meat", 10);
        inventory.put("Ham", 1);
        inventory.put("Potatoes", 13);

        // An Entry set returns key-value pairs
        // You get BOTH the key and value directly from the Map. Entry object using fruit.getKey() and fruit.getValue().
//        for (Map.Entry<String, Integer> fruit : inventory.entrySet()) {
//            System.out.println(fruit.getKey() + " => " + fruit.getValue());
//        }

        System.out.println(inventory + " ");
        System.out.println("\nChecking quantity of Ham: " + inventory.get("Potatoes") + " units");

        //Restock product
        inventory.put("Ham", inventory.get("Ham") + 10);
        System.out.println("\nRestocked Ham. New quantity: " + inventory.get("Ham") + " units");

        // Mark a product as out of stock by setting its quantity to zero
        inventory.put("Cheese", 0);
        System.out.println("\nCheese is now out of stock. Updated Inventory: " + inventory);

        inventory.remove("Cheese");
        System.out.println("\nRemoved Cheese from inventory. Updated Inventory: " + inventory);

        System.out.println("\nFinal inventory" + " " +inventory);
    }
}

