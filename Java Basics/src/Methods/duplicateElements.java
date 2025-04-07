package Methods;

import java.util.Arrays;
import java.util.HashSet;

public class duplicateElements {
    public static int[] removeDuplicates(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Array cannot be null.");
        }

        HashSet<Integer> uniqueNumbers = new HashSet<>();

        for (int num : numbers) {
            uniqueNumbers.add(num);
        }

        // Convert the set back to an array
        int[] uniqueArray = new int[uniqueNumbers.size()];
        int index = 0;
        for (int num : uniqueNumbers) {
            uniqueArray[index++] = num;
        }

        return uniqueArray;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7};
        int[] result = removeDuplicates(numbers);

        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }
}


