package ConditionalStatements;

import java.util.Scanner;

public class celsiumToFarenhait {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter temperature in ");
        float temperature = myScanner.nextFloat();

        System.out.println("Convert to Celsius/Fahrenheit:: ");
        String degree = myScanner.next();
        float formulaCelsius = (temperature - 32) * (5f / 9f);
        float formulaFahrenheit = (temperature * 9f / 5f) + 32;
        if (degree.equals("Celsius")) {
            System.out.println("Temperature in Celsius: " + formulaCelsius);
        } else if (degree.equals("Fahrenheit")) {
            System.out.println("Temperature in Farenhait is: " + formulaFahrenheit);

        } else {
            System.out.println("Invalid input! Please enter 'Celsius' or 'Fahrenheit'.");
        }
        myScanner.close();
    }
}
