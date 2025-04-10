package Hw3;

public abstract class Vehicle {
	
    private String licencePlateNumber;
    private String category;
    private String transmission;
    private String brand;
    private String model;
    private int year;
    private int dailyPrice;

    public Vehicle(String licencePlateNumber, String category, String transmission, String brand, String model, int year, int dailyPrice) {
        this.licencePlateNumber = licencePlateNumber;
        this.category = category;
        this.transmission = transmission;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.dailyPrice = dailyPrice;
    }

    
    public String getLicencePlateNumber() {
        return licencePlateNumber;
    }
    public void setLicencePlateNumber(String licencePlateNumber) {
        this.licencePlateNumber = licencePlateNumber;
    }
   
    
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    
    public String getTransmission() {
        return transmission;
    }
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
    
    
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    
    public int getDailyPrice() {
        return dailyPrice;
    }
    public void setDailyPrice(int dailyPrice) {
        this.dailyPrice = dailyPrice;
    }
    
    
    public abstract double calculateRentalFee(int numOfDays);
    
    @Override
    public String toString() {
        return "Vehicle{licencePlateNumber = " + licencePlateNumber 
        		+ " + Category = " + category 
        		+ " Transmission = " + transmission
        		+ " + Brand = " + brand 
        		+ " + Model = " + model
        		+ " + Year = " + year 
        		+ " + dailyPrice = " + dailyPrice + "}";
    }
}