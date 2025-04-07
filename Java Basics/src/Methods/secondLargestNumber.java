package Methods;

public class secondLargestNumber {

    public static int secondLargestNumberArray(int[] numbers){
        int secondLargest = -1; // Assume -1 if no valid second-largest number is found

        if (numbers.length < 2) {
            return secondLargest;
        }

        int largest = numbers[0];

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }
        System.out.println("The largest is: " + largest);
        return secondLargest;

    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 4, 45, 67};
        int result = secondLargestNumberArray(numbers);

        System.out.println("Second largest is :"+ result);

    }
}
