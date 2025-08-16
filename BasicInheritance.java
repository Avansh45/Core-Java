
class Animal{
    public void printMe(){
        System.out.println("From Animal Class");
    }

}
class Dog extends Animal{

    Dog(){
        System.out.println("From Dog Class!");
    }
    public void type(){
        System.out.println("I am Dog");
    }
    public void bark(){
        System.out.println("Barking");
    }
}

public class BasicInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.type();
        d.bark();

        d.printMe();
    }
}
