package Inheritence;

public class Shape {

    double Area = 0;

    public double displayCalculatedArea(double diameter) {
        System.out.println("Not valid diameter for area!");
        return Area;
    }


    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.displayCalculatedArea(0);

        Circle circle2 = new Circle();
        circle2.displayCalculatedArea(100);

        Rectangle rectangle = new Rectangle();
        rectangle.displayCalculatedArea(2,5);
    }

}