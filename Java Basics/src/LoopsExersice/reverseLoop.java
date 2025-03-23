package LoopsExersice;

public class reverseLoop {
    public static void main(String[] args) {
        int[] list = {10, 20, 30, 40, 50}; // Given list

        System.out.println("Reversed List:");
        for (int i = list.length - 1; i >= 0; i--) {
            System.out.print(list[i] + " "); // Print elements in reverse order
        }
    }
}
