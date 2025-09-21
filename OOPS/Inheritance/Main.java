package OOPS.Inheritance;

public class Main {
    public static void main(String[] args) {
        //For Person and Student Classes

        // Student student = new Student();
        // student.name="Anshu";
        // student.age = 20;
        // student.course= "be-cse";
        // student.display();



        //For Parent and Child classes 

        // Child c = new Child();
        // c.greet();
        // System.out.println(c.sayHello());


        Animal d = new Dog();//Reference of Animal class And object is created for dog class
        d.sound();
        Cat cat = new Cat();
        cat.sound();

    }
}
