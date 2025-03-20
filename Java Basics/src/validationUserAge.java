import java.util.Scanner;

public class validationUserAge {
    public static void main(String[] args) {
        Scanner myScanner =  new Scanner(System.in);
        System.out.println("Input Age is:");
        float Age = myScanner.nextFloat();

        if(16 <= Age){
            System.out.println("Person is eligible to work.");
        } else {
            System.out.println("Person is not eligible to work.");
        }
    }
}
