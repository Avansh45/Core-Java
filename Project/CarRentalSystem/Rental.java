package Project.CarRentalSystem;

class Rental {
    private String rentalId;
    private User user;
    private Car car;
    private int days;
    private double totalCost;
    private boolean isActive;
    private Payment payment;

    public Rental(String rentalId, User user, Car car, int days) {
        this.rentalId = rentalId;
        this.user = user;
        this.car = car;
        this.days = days;
        this.totalCost = days * car.getPricePerDay();
        this.isActive = true;
    }

    
    public String getRentalId() { 
        return rentalId; 
    }
    public User getUser() { 
        return user; 
    }
    public Car getCar() { 
        return car; 
    }
    public int getDays() { 
        return days; 
    }
    public double getTotalCost() { 
        return totalCost; 
    }
    public boolean isActive() { 
        return isActive; 
    }
    public Payment getPayment() { 
        return payment; 
    }

    
    public void setActive(boolean active) { 
        isActive = active; 
    }
    
    public void setPayment(Payment payment) { 
        this.payment = payment; 
    }

    @Override
    public String toString() {
        return String.format("Rental %s: %s rented %s %s for %d days - %.2f",
                rentalId, user.getName(), car.getBrand(), car.getModel(), 
                days, totalCost);
    }
}
