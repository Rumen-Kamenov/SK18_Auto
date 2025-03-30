package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class LotteryNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> lotteryNumbers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        lotteryNumbers.add(3);
        lotteryNumbers.add(15);
        lotteryNumbers.add(29);
        lotteryNumbers.add(21);
        lotteryNumbers.add(8);
        lotteryNumbers.add(2);
        // Ask user to input a number
        System.out.println("Enter winning number: ");
        int userNumber = scanner.nextInt();

        // Check for containing winning number .
        if (lotteryNumbers.contains(userNumber)) {
            System.out.println("Congratulations! " + userNumber + " is a winning number!");
        } else{
            System.out.println("Sorry, " + userNumber + " is not a winning number.");
        }
        // Print all winning lottery numbers
        System.out.println("Winning Lottery Numbers:");
        for (int number : lotteryNumbers) {
            System.out.print(number + " ");
        }
    }
}
