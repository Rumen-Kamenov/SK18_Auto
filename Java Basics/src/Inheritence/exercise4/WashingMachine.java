package Inheritence.exercise4;

public class WashingMachine extends Appliance {

    int loadCapacity;

    public WashingMachine(String brand, int powerConsumption, int loadCapacity){
        super(brand,powerConsumption);
        this.loadCapacity = loadCapacity;
    }

    public void startingWashCycle(){
        if(super.isOn){
            System.out.println("Starting washing machine with" + loadCapacity + "kg");
        } else {
            System.out.println("cannot start washing cycle");
        }
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Loadcapacity: " + loadCapacity + "kg");
    }

    @Override
    public void factoryReset(){
        super.factoryReset();
        this.loadCapacity = 0;
    }

}
