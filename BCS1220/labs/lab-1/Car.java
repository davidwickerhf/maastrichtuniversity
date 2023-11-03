
public class Car {
    public static int motorCounter = 0;
    public static String refills;

    private double efficiency; // l/km
    private double fuel; // l
    private int motorNumber;

    public Car(double efficiency) {
        this.efficiency = efficiency;
        this.fuel = 0;
        motorCounter += 1;
        this.motorNumber = motorCounter;
    }

    public boolean canDrive(double distance) {
        if (distance * this.efficiency > fuel)
            return false;
        return true;
    }

    public void drive(double distance) {
        this.fuel -= this.efficiency * distance;
    }

    public double getFuel() {
        return this.fuel;
    }

    public void addFuel(double fuel) {
        this.fuel += fuel;
        refills += String.format("\nCar Motor Number %d: .2%f liters", this.motorNumber, fuel);
    }

    public static String fuelRefills() {
        return refills;
    }

    public static void main(String[] args) {
        // Test if the car, tanked initially 40 liters has to drive 400km
    }

}
