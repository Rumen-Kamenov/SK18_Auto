package Methods;

import java.util.Scanner;

public class averageNumber {
    public static double numberAverage (double num1 , double num2, double num3 ){

        return (num1 + num2+ num3) / 3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();

        double average = numberAverage(num1,num2, num3); // Value from the user input

        System.out.println("Average value is: " + average);
    }
}
