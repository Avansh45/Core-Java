class Engine implements Cloneable {
    String name;
    String type;

    Engine(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy is enough for Strings
    }
}
