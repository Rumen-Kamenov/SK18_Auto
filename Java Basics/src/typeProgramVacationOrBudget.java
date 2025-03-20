import java.util.Scanner;

public class typeProgramVacationOrBudget {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter destination:");
        String typeVacation = myScanner.next();
        System.out.println("Enter budget:");
        float budget = myScanner.nextFloat();

        if (typeVacation.equals("Mountain") || typeVacation.equals("Beach")) {
            if (budget <= 50 && typeVacation.equals("Beach")) {
                System.out.println("Bulgaria is your destination for Beach!");
                }

            if (budget > 50 && typeVacation.equals("Beach")){
                System.out.println("OUTSIDE BULGARIA");
            }

            if (budget <= 30 && typeVacation.equals("Mountain")) {
                System.out.println("Bulgaria is your destination for Mountain !");
            }
            if(budget > 30 && typeVacation.equals("Mountain")){
                System.out.println("Outside Bulgaria! ");
            }

        }

        if(typeVacation != "Mountain" || typeVacation != "Beach")
            System.out.println("There is no information .Please input text with upper letter");
    }
}

