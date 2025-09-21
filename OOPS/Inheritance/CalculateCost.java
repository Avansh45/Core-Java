package OOPS.Inheritance;

class Vehicle{
    double distance;
    Vehicle(double distance){
        this.distance = distance;
    }

    double calculateCost(){
        return 0;
    }
}

class Car extends Vehicle{

    Car(double distance){
        super(distance);
    }
    @Override
    double calculateCost(){
        return distance * 10;
    }
}

class Bike extends Vehicle{
    Bike(double distance){
        super(distance);
    }
    @Override
    double calculateCost(){
        return distance * 5;
    }
}

class Truck extends Vehicle{
    Truck(double distance){
        super(distance);
    }
    @Override
    double calculateCost(){
        return distance  * 15;
    }
}
public class CalculateCost {
    public static void main(String[] args) {
        
        Vehicle[] Motors = {
            new Car(100),
            new Bike(500),
            new Truck(750)

        };

        for (Vehicle vehicle : Motors) {
            vehicle.calculateCost();
            System.out.println(vehicle.getClass().getSimpleName()+" Cost : "+vehicle.calculateCost());
        }


    }
}
