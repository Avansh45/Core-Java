package OOPS.Abstraction;

abstract class Shape{
    double length;
    double breadth;
    double radius;
    protected Shape(double radius){
        this.radius = radius;
    }
    protected Shape(double length,double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    abstract double area();
}


class Rectangle extends Shape{

    Rectangle(double length,double breadth){
        super(length,breadth);
    }
    double area(){
        System.out.print("Area of Rectangle is : ");
        return length*breadth;
    }
}

class Square extends Shape{
    Square(double radius){
        super(radius);
    }
    double area(){
        System.out.print("Area of Sqaure is: ");
        return radius * radius;
    }
}
public class ShapeProgram {
    
    public static void main(String[] args) {
        
        Rectangle rect = new Rectangle(2.7,5.25);
        System.out.println(rect.area());

        Shape sq = new Square(8.5);
        System.out.print(sq.area());
    }
}
