
abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    public void write(){
        System.out.println("Writing with Fountain Pen");
    }
    public void refill(){
        System.out.println("Refilling the Fountain Pen");
    }
    void changeNib(){
        System.out.println("Changing the Nib of Pen");
    }
}

///////////////////////////////////////////////////////////

class Monkey{
    void jump(){
        System.out.println("Monkey Jump");
    }
    void bite(){
        System.out.println("Monkey Bite");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{ 
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
}


///////////////////////////////////////
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartPhone extends Telephone{
    void ring(){
        System.out.println("SmartPhone is Ringing");
    }
    void lift(){
        System.out.println("LIft SmartPhone");
    }
    void disconnect(){
        System.out.println("Smartphone Disconnected");
    }
}



////////////////////////////


interface TvRemote{
    void turnOn();
    void turnOff();
}
interface SmartTvRemote extends TvRemote{
    void type();
}

class Tv implements TvRemote{
    void printMe(){
        System.out.println("From T.V Class");
    }
    public void turnOn(){
        System.out.println("Turning On Tv");
    }
    public void turnOff(){
        System.out.println("Turning off Tv");
    }
}

class AbstractPractice{
    public static void main(String[] args){
        // FountainPen fp=new FountainPen();
        // fp.changeNib();                  
        // fp.write();
        // fp.refill();

        /////////////////////////
        // Monkey m=new Human();       //polymorphism
        // m.eat();
        // m.sleep();
        // m.bite();
        // m.jump();


        //////////////////////////////////
        // Telephone sp = new SmartPhone();
        // sp.ring();
        // sp.lift();
        // sp.disconnect();

        Tv t=new Tv();
        t.turnOn();
        t.turnOff();


    }
}