import java.util.Scanner;

public class calculateRevenue {
        public static void main(String[] args) {

            Scanner myScanner = new Scanner(System.in);
            System.out.println("Enter unit price:");
            float unitPrice = myScanner.nextFloat();

            System.out.println("Enter quantity:");
            float quantity = myScanner.nextFloat();

            if(quantity < 100) {

                System.out.println("There is no discount!");
            }   else if (quantity <= 120) {
                float staticDiscount = 15;
                double discountStatic = unitPrice * quantity * 0.15;
                double revenue = unitPrice * quantity - unitPrice * quantity * 0.15;
                System.out.println("The revenue from sale is: " + revenue + "$");
                System.out.println("Discount is: " + discountStatic + "$ " + "(" + staticDiscount + ")");

            }   if(quantity > 120){
                float staticDiscount = 20;
                double discountStatic = unitPrice * quantity * 0.20;
                double revenue = unitPrice * quantity - (unitPrice * quantity) * 0.20;

                System.out.println("The revenue from sale is: " + revenue + "$");
                System.out.println("Discount is: " + discountStatic + "$ " + "(" + staticDiscount + ")");
                }
        }
}
