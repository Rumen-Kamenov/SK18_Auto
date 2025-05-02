package ConditionalStatements;

import java.util.Scanner;

public class simpleCheckForNumberString {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter N:");

        int n = myScanner.nextInt();
        String str = String.valueOf(n);

        if(-100 > n &&  n <= 100){
            System.out.println("Wrong answer");
        } else {
            System.out.println("Good job");
        }
    }
}
