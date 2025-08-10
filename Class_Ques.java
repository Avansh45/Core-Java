
//Problem 1 Class
class Employee_Details  {
    int Salary;
    String name;

    public int getSalary(int n){
        return Salary;
    }

    public String getName(String s){
        return name;
    }
    public void setName(String a){
        name =a;
    }
}

// Problem 2 Class

class CellPhone{
    public void rings(){
        System.out.println("Ringing");
    }
    public void vibrate(){
        System.out.println("Vibrating");
    }
    public void call(){
        System.out.println("Calling Anshu");
    }
}


// Problem 3 Class
class Square{

    public float area(float n){
        return n*n;
    }
    public float perimeter(float x){
        return 4*x;
    }
}


// Problem 4 Class

class Rectangle{

    public float area(float a,float b){
        return a*b;
    }
    public float perimeter(float l,float b){
        return 2*(l*b);
    }
}


// Problem 5 Class
class TommyVecetti{
    public void hit(){
        System.out.println("Hitting");
    }
    public void run(){
        System.out.println("Runnung");
    }
    public void fire(){
        System.out.println("Firing");
    }
}


// Problem 6 Class

class Circle{
    float pi=3.14159265359f;
    public float area(float r){
        return pi*(r*r);
    }
    public float perimeter(float r1){
        return 2*pi*r1;
    }
}
public class Class_Ques{
    public static void main(String[] args) {
        
        // Problem 1
        // Employee_Details ed =new Employee_Details();
        // ed.setName("Avansh");
        // System.out.println(ed.getName(""));
        // System.out.println(ed.getSalary(55555));


        // Problem 2
        // CellPhone cp = new CellPhone();
        // cp.rings();
        // cp.vibrate();
        // cp.call();



        // Problem 3
        // Square sq = new Square();
        // float s=5;
        // System.out.println(sq.area(s));
        // System.out.println(sq.perimeter(s));


        // Problem 4
        // Rectangle r = new Rectangle();
        // float a=5,s=7;
        // System.out.println(r.area(a, s));
        // System.out.println(r.perimeter(a,s));


        // Problem 5

        // TommyVecetti tv = new TommyVecetti();
        // tv.run();
        // tv.hit();
        // tv.fire();


        // Problem 6
        Circle c = new Circle();
        float i=5f;
        System.out.println(c.area(i));
        System.out.println(c.perimeter(i));
    }
}
