import java.util.Scanner;

public class leapYearExersice {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter year: ");
        int myYear = myScanner.nextInt();
        if ( myYear % 4 == 0 && myYear % 100 != 0 || myYear % 400 == 0){
            System.out.println("Year is Leap!");
        } else {
            System.out.println("Not a leap year!");
        }
    }
}
