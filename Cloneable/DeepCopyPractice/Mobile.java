package DeepCopyPractice;

public class Mobile implements Cloneable{
    
    private double price;
    private String brand;
    private int model;
    Specifications spec;

    public Mobile(double price, String brand, int model) {
        this.price = price;
        this.brand = brand;
        this.model = model;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        Mobile clonedmobile = (Mobile)super.clone();
        clonedmobile.spec = (Specifications) spec.clone();
        return clonedmobile;
    }

    @Override
    public String toString() {
        return "Mobile -> price=" + price + ", brand=" + brand + ", model=" + model + ", spec=" + spec;
    }




    class Specifications implements Cloneable{

        String processor;
        int ram;
        int storage;
        String battery;

        public Specifications(String processor, int ram, int storage, String battery) {
            this.processor = processor;
            this.ram = ram;
            this.storage = storage;
            this.battery = battery;
        }

        @Override
        public Object clone() throws CloneNotSupportedException{

            return super.clone();
        }

        @Override
        public String toString() {
            return "Specifications [processor=" + processor + ", ram=" + ram + ", storage=" + storage + ", battery="
                    + battery + "]";
        }
        
        
    }
}
