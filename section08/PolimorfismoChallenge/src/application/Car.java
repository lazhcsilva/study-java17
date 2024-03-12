package application;

public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Start System Car!");
    }

    public void drive() {
        System.out.println("Car -> driving, type is " + getClass().getSimpleName());
        runEngine() ;
    }

    protected void runEngine(){
        System.out.println("Car -> runEngine");
    }

}

class GasPoweredCar extends Car{

    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description){
        super(description);
    }


    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine(){
        System.out.println("Start System Car!");
    }

}

class ElectricCar extends Car{

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine(){
        System.out.printf("BEV -> switch %d kWh battery on, Ready!%n", batterySize);
    }

    @Override
    public void runEngine(){
        System.out.printf("BEV -> usage under the average: %.2f %n", avgKmPerCharge);
    }

}

class HybridCar  extends Car{

    private double avgKmPerLiter;
    private int batterySize;
    private int cylinders = 6;

    public HybridCar(String description, double avgKmPerLiter, int cylinders, int batterySize) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine(){
        System.out.printf("Hydred -> %d cylinders are fired up.%n", cylinders);
        System.out.printf("Hydrid -> switch %d kWh battery on, Ready!%n", batterySize);
    }

    @Override
    public void runEngine(){
        System.out.printf("Hydrid -> usage below average: %.2f %n", avgKmPerLiter);
    }
}
