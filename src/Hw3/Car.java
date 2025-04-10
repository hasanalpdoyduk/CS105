package Hw3;

public class Car extends Vehicle {
	
    private int seatCount;

    public Car(String licencePlateNumber, String category, String transmission, String brand, String model, int year, int dailyPrice, int seatCount) {
        super(licencePlateNumber, category, transmission, brand, model, year, dailyPrice, seatCount);
        this.seatCount = seatCount;
    }

    
    public int getSeatCount() {
        return seatCount;
    }
    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    @Override
    public double calculateRentalFee(int numOfDays) {
        double rentalFee = 50.0;
        if (getNumOfDoors() > 4) {
            rentalFee += 20.0;
        }
        return rentalFee * numOfDays;
    }

    @Override
    public String toString() {
        return "Car{licencePlateNumber = " + getLicencePlateNumber()
		+ " + Category = " + getCategory()
		+ " Transmission = " + getTransmission()
		+ " + Brand = " + getBrand()
		+ " + Model = " + getModel()
		+ " + Year = " + getYear() 
		+ " + dailyPrice = " + getDailyPrice() 
		+ " + seatCount = " + getSeatCount() + "}";
    }
}
