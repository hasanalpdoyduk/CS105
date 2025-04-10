package Hw3;

public class Motorcycle extends Vehicle {
    private int engineCapacity;

    public Motorcycle(String plateNumber, String brand, int year, int engineCapacity) {
        super(plateNumber, brand, year);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public double calculateRentalFee(int numOfDays) {
        return 20.0 * numOfDays;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "plateNumber='" + getPlateNumber() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", year=" + getYear() +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
