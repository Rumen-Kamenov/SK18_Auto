package Inheritence.exercise2;

public class Main {
    public static void main(String[] args) {
        Refrigerator refrigerator = new Refrigerator("Samsung",220,90);
        WashingMachine washingMachine = new WashingMachine("Whirlpool", 120,9);

        washingMachine.displayInfo();
        washingMachine.startingWashCycle();
        washingMachine.displayInfo();

        refrigerator.displayInfo();
        refrigerator.setTemperature(70);
        refrigerator.displayInfo();
    }
}
