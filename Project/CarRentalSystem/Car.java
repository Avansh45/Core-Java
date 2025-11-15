package Project.CarRentalSystem;

class Car {
    private String carId;
    private String brand;
    private String model;
    private String type;
    private double pricePerDay;
    private boolean isAvailable;

    public Car(String carId, String brand, String model, String type, double pricePerDay) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.pricePerDay = pricePerDay;
        this.isAvailable = true;
    }

    
    public String getCarId() { 
        return carId; 
    }
    public String getBrand() { 
        return brand; 
    }
    public String getModel() { 
        return model; 
    }
    public String getType() { 
        return type; 
    }
    public double getPricePerDay() {
         return pricePerDay; 
        }
    public boolean isAvailable() { 
        return isAvailable; 
    }

    
    public void setAvailable(boolean available) { 
        isAvailable = available; 
    }

    @Override
    public String toString() {
        return String.format("%s - %s %s (%s) - %.2f/day [%s]",
                carId, brand, model, type, pricePerDay,
                isAvailable ? "Available" : "Rented");
    }
}
