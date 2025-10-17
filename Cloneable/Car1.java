
class Car1 implements Cloneable {
    int model;
    String brand;
    Engine engine;// For this(Engine) if we will try to make clone it will copy reference only so whenever
                  // we will change thenew object it will affect old object also

    Car1(int model, String brand, Engine engine) {
        this.model = model;
        this.brand = brand;
        this.engine = engine;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Car1 clonecar = (Car1) super.clone();
        clonecar.engine = (Engine) engine.clone(); // deep copy of engine
        return clonecar;
    }
}
