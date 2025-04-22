package Inheritence.exercise1;

public class Rectangle extends Shape{

    double width ;
    double height;
    double Area ;

    public double displayCalculatedArea(double width, double height) {
        Area = width * height;
        System.out.println("Area of Rectangle is : " + Area);
        return Area;
    }
}
