package LoopsExersice;

public class firstMultipleByFive {
    public static void main(String[] args) {
        int[] numbers = {12, 17, 22, 25, 36, 45, 50}; // Example array

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 5 == 0) { // Check if the number is a multiple of 5
                System.out.println("First multiple of 5: " + numbers[i]);
                break; // Stop the loop after finding the first multiple of 5
            }
        }
    }
}
