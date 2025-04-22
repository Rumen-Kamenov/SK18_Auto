package Inheritence.exercise4;

public class Refrigerator extends Appliance {

    int temperature;

    //Constructor for Refrigerator
    public Refrigerator(String brand, int powerConsumption,int temperature){
        super(brand,powerConsumption);
        this.temperature = 0;
    }

    public void setTemperature(int temperature){
        if (temperature >= -3 && temperature<= 5){
            this.temperature = temperature;
        } else {
            this.temperature = 0;
        }
        System.out.println("Temperature set to: " + this.temperature + " Celsius");
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Temperature " + temperature + " Celsius");
    }

    @Override
    public void factoryReset(){
        super.factoryReset();
        this.temperature = 0;
    }


}
