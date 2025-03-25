package ConditionalStatements;

import java.util.Scanner;

public class PrintFirstTenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0 ;

        //System.out.println("Enter Number");
        int N = scanner.nextInt();

        for (int i = 1; i <=10 ; i++){
            result = N * i ;
            System.out.println(N + " x " + i + " = " + result);
        }
    }
}
