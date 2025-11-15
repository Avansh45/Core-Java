package Project.CarRentalSystem;

import java.util.*;
import java.util.stream.Collectors;

class CarRentalSystem {
    private Map<String, Car> cars;
    private Map<String, User> users;
    private List<Rental> rentals;
    private int rentalCounter = 1;
    private int paymentCounter = 1;

    public CarRentalSystem() {
        cars = new HashMap<>();
        users = new HashMap<>();
        rentals = new ArrayList<>();
    }

    
    public void addCar(Car car) {
        cars.put(car.getCarId(), car);
        System.out.println("Car added: " + car);
    }

    
    public void registerUser(User user) {
        users.put(user.getUserId(), user);
        System.out.println("User registered: " + user);
    }

    
    public List<Car> searchByType(String type) {
        return cars.values().stream()
                .filter(car -> car.getType().equalsIgnoreCase(type))
                .filter(Car::isAvailable)
                .sorted(Comparator.comparingDouble(Car::getPricePerDay))
                .collect(Collectors.toList());
    }

    
    public List<Car> getAvailableCars() {
        return cars.values().stream()
                .filter(Car::isAvailable)
                .sorted(Comparator.comparingDouble(Car::getPricePerDay))
                .collect(Collectors.toList());
    }

    
    public void bookCar(String userId, String carId, int days, String paymentMethod) {
        User user = users.get(userId);
        Car car = cars.get(carId);

        if (user == null) {
            System.out.println("User not found!");
            return;
        }
        if (car == null) {
            System.out.println("Car not found!");
            return;
        }
        if (!car.isAvailable()) {
            System.out.println("Car is not available!");
            return;
        }

        
        String rentalId = "R" + rentalCounter++;
        Rental rental = new Rental(rentalId, user, car, days);

        
        String paymentId = "P" + paymentCounter++;
        Payment payment = new Payment(paymentId, rental.getTotalCost(), paymentMethod);
        rental.setPayment(payment);

        
        car.setAvailable(false);
        rentals.add(rental);

        System.out.println("\nBooking successful!");
        System.out.println(rental);
        System.out.println(payment);
    }

    
    public void returnCar(String rentalId) {
        Rental rental = findActiveRental(rentalId);
        
        if (rental == null) {
            System.out.println("Rental not found!");
            return;
        }

        rental.setActive(false);
        rental.getCar().setAvailable(true);

        System.out.println("\nCar returned successfully!");
        System.out.println(rental);
    }

    
    public void cancelBooking(String rentalId) {
        Rental rental = findActiveRental(rentalId);
        
        if (rental == null) {
            System.out.println("Rental not found!");
            return;
        }

        rental.setActive(false);
        rental.getCar().setAvailable(true);

        System.out.println("\nBooking cancelled!");
    }

    
    private Rental findActiveRental(String rentalId) {
        return rentals.stream()
                .filter(r -> r.getRentalId().equals(rentalId))
                .filter(Rental::isActive)
                .findFirst()
                .orElse(null);
    }

    
    public void generateRevenueReport() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("            REVENUE REPORT");
        System.out.println("=".repeat(50));

        
        double totalRevenue = rentals.stream()
                .mapToDouble(Rental::getTotalCost)
                .sum();

        
        Map<String, Double> revenueByType = rentals.stream()
                .collect(Collectors.groupingBy(
                        r -> r.getCar().getType(),
                        Collectors.summingDouble(Rental::getTotalCost)
                ));

        
        Map<String, Long> popularCars = rentals.stream()
                .collect(Collectors.groupingBy(
                        r -> r.getCar().getBrand() + " " + r.getCar().getModel(),
                        Collectors.counting()
                ));

        System.out.println("\nTotal Revenue: " + String.format("%.2f", totalRevenue));
        
        System.out.println("\nRevenue by Car Type:");
        revenueByType.forEach((type, revenue) -> 
            System.out.println("  " + type + ": " + String.format("%.2f", revenue))
        );

        System.out.println("\nMost Popular Cars:");
        popularCars.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(3)
                .forEach(entry -> 
                    System.out.println("  " + entry.getKey() + ": " + entry.getValue() + " rentals")
                );

        System.out.println("=".repeat(50));
    }

    
    public void showStatistics() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("          SYSTEM STATISTICS");
        System.out.println("=".repeat(50));

        long available = cars.values().stream().filter(Car::isAvailable).count();
        long rented = cars.values().stream().filter(c -> !c.isAvailable()).count();
        long activeRentals = rentals.stream().filter(Rental::isActive).count();

        System.out.println("\nFleet Status:");
        System.out.println("  Total Cars: " + cars.size());
        System.out.println("  Available: " + available);
        System.out.println("  Rented: " + rented);

        System.out.println("\nRental Status:");
        System.out.println("  Total Rentals: " + rentals.size());
        System.out.println("  Active Rentals: " + activeRentals);
        System.out.println("  Total Users: " + users.size());

        System.out.println("=".repeat(50));
    }

    
    public void showAllCars() {
        System.out.println("\n--- All Cars ---");
        cars.values().forEach(System.out::println);
    }

    
    public void showAvailableCars() {
        System.out.println("\n--- Available Cars (Sorted by Price) ---");
        getAvailableCars().forEach(System.out::println);
    }
}