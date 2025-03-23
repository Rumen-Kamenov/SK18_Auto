package LoopsExersice;

public class SkipMultipleOfThree {
    public static void main(String[] args) {

        int[] numbers = {10, 15, 22, 30, 41, 45, 50};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0) {
                continue; // Skip numbers that are multiples of 3
            }
            System.out.println(numbers[i]); // Print other numbers
        }
    }
}
