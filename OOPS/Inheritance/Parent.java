package OOPS.Inheritance;
//Refer main class for understanding
class GrandParent{
    // private int a;
    // public int b;
    // protected int c;
    // int d;
    GrandParent(){
        System.out.println("Constructor from Grand parent Class !");
    }

}


class Parent extends GrandParent {
    Parent(){
        System.out.println("Constructor from Parent Class !");
    }
    void greet(){
        System.out.println("Greeting from Parent Class !");
    }
}


class Child extends Parent{

    Child(){
        System.out.println("Constructor from Child Class !");
    }

    String sayHello(){
        
        return "Hello from Child Class !";
    }
}


class Animal{

    void sound(){
        System.out.println("Animal Sound !");
    }
}
class Dog extends Animal{

    void sound(){
        System.out.println("Dog Sound -> Barking....");
    }
}

class Cat extends Animal{

    void sound(){
        System.out.println("Cat Sound -> Meow....");
    }
}