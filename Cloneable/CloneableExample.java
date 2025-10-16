
public class CloneableExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Engine newengine = new Engine("V8", "Electric");

        Car car = new Car(2025, "Own Brand", newengine);
        System.out.println("Old car Engine Type : " + car.engine.type);

        // Clone Car
        Car newcar = (Car) car.clone();
        newcar.brand = "Friend's Brand";
        newcar.engine.type = "Diesel";
        newcar.engine.name = "32B";

        System.out.println("Old car Engine Type : " + car.engine.type);
        System.out.println("New car Engine Type : " + newcar.engine.type);

        System.out.println("Old Engine Name : " + car.engine.name);
        System.out.println("New Engine Name : " + newcar.engine.name);

        System.out.println("Old Car Brand : " + car.brand);
        System.out.println("New Car Brand : " + newcar.brand);
    }
}
