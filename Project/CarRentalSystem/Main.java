package Project.CarRentalSystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        CarRentalSystem system = new CarRentalSystem();

        System.out.println("===*** CAR RENTAL SYSTEM ***===\n");

        
        System.out.println("--- Adding Cars ---");
        system.addCar(new Car("Car 01", "Toyota", "Camry", "Sedan", 500.0));
        system.addCar(new Car("Car 02", "Honda", "Civic", "Sedan", 450.0));
        system.addCar(new Car("Car 03", "Ford", "Explorer", "SUV", 800.0));
        system.addCar(new Car("Car 04", "Jeep", "Wrangler", "SUV", 850.0));
        system.addCar(new Car("Car 05", "BMW", "X5", "Luxury", 1500.0));
        system.addCar(new Car("Car 06", "Mercedes", "S-Class", "Luxury", 2000.0));

        
        System.out.println("\n--- Registering Users ---");
        system.registerUser(new User("User 01", "Rohit", "rohit@gmail.com", "9895680101"));
        system.registerUser(new User("User 02", "Ajay", "ajay@gmail.com", "9858501022"));
        system.registerUser(new User("User 03", "Gourav", "gourav@gmail.com", "9505550103"));

        
        system.showAllCars();

        
        System.out.println("\n-------- Search: SUV Cars --------");
        List<Car> suvs = system.searchByType("SUV");
        suvs.forEach(System.out::println);

        System.out.println("\n--------- Search: Luxury Cars --------");
        List<Car> luxury = system.searchByType("Luxury");
        luxury.forEach(System.out::println);

        
        System.out.println("\n------------ Booking Cars ------------");
        system.bookCar("User 01", "Car 03", 5, "Credit Card");
        system.bookCar("User 02", "Car 05", 3, "Debit Card");
        system.bookCar("User 03", "Car 01", 7, "Cash");

        
        system.showAvailableCars();

        
        System.out.println("\n-------- Returning Car --------");
        system.returnCar("R1");

        
        System.out.println("\n------- Cancelling Booking -------");
        system.cancelBooking("R3");

        
        system.showStatistics();
        system.generateRevenueReport();
    }
}
