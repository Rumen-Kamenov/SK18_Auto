package LoopsExersice;

public class largestNumberArray {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,8,9,10};
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("The largest number in the array is: " + max);
    }
}
