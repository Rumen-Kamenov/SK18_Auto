package LoopsExersice;

public class CalculateAverage {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50}; // Example list of numbers
        int sum = 0; // Variable to store the sum

        // Loop to calculate the sum of numbers
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        double average = (double) sum / numbers.length;

        System.out.println("Average: " + average);
    }
}
