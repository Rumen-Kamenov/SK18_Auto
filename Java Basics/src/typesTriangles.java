import java.util.Scanner;

public class typesTriangles {
    public static void main(String[] args) {
        Scanner side = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Side A:");
        int sideA = side.nextInt();
        System.out.println("Enter Side B: ");
        int sideB = side.nextInt();
        System.out.println("Enter Side C: ");
        int sideC = side.nextInt();
        int result = sideA + sideB + sideC;

        if(result == 180){
            if (sideA == 60 && sideB == 60 && sideC == 60){
                System.out.println("The triange is equilateral ");
            } else if (sideA == 90 || sideB == 90 || sideC == 90)
                System.out.println("The triangle is right angled");
              else if (sideA > 90 ||sideB > 90 || sideC > 90) {
                System.out.println("The triangle is obtuse!");
            }else if (sideA == sideB || sideA==sideC || sideB == sideC) {
                System.out.println("The triangle is isosceles!");
            } else {
            System.out.println("Not a triangle");
            }
        }
    }
}
