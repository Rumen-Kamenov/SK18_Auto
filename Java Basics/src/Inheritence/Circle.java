package Inheritence;

public class Circle extends Shape{
    private double P =3.14;


    public double displayCalculatedArea(double diameter){
        Area = (P * diameter)*diameter;
        System.out.println("Area of Circle is: " + Area);

        if (Area == 0){
            System.out.println("Invalid number for shape! ");
            System.out.println("");
        }
        return Area;
    }

}
