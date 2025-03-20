import java.util.Scanner;

public class daysOftheWeek {
    public static void main(String[] args) {

        Scanner myScanner =  new Scanner(System.in);
        System.out.println("Day of the week is (1-7) :");
        int dayNum = myScanner.nextInt();
        switch (dayNum){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Satuday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number of day!");
        }
    }
}
