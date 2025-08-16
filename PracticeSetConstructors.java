
class Cylinder{

    //Problem 1
    //Create a  class Cylinder and use getters and setters to get and set their values
    double radius;
    double height;
    void setRadius(double r){
        radius=r;
    }
    void setHeight(double h){
        height=h;
    }
    double getRadius(){
        return radius;
    }
    double getHeight(){
        return height;
    }

    // Problem 2
    // Using 1 calculate the surface area and volume of cylinder
    
    double surfaceArea(double r , double h){
        double SA=(2.0*3.14*radius*height)+(2.0*3.14*radius*radius);
        return SA;
    }
    double volume(double r , double h){
        double V = 3.14*radius*radius*height;
        return V;
    }


    // Problem 3
    //Printing the value of r and h using Constructor
    Cylinder(double r,double h){
        System.out.println("Values for Cylinder:");
        System.out.println(r);
        System.out.println(h);
    }



    //Problem 4
    //Overload a constructor used to initilize the length and breadth of the rectangle for using custom parameters
    Cylinder(int length,int breath){
        System.out.println("Values of Rectangle:");
        System.out.println(length);
        System.out.println(breath);
    }
    



    // Problem 5
    // Repeat 1 for sphere
    
    void setRadiusOfSphere(double r){
        radius=r;
    }

    double getRadiusOfSphere(){
        return radius;
    }


}

public class PracticeSetConstructors {
    public static void main(String[] args) {
        //Problem 1

        Cylinder c = new Cylinder(5,9);         //Problem 3         //Problem 4
        // Cylinder c = new Cylinder();
        // double h1 =9;
        // double r1 =6;
        // c.setHeight(h1);
        // c.setRadius(r1);
        // System.out.println("Height of Cylinder : "+c.getHeight());
        // System.out.println("Radius of Cylinder : "+c.getRadius());
        // System.out.println();
        
        
        //Problem 2
        
        // System.out.println("Surface Area of Cylinder : "+c.surfaceArea(r1,h1) );       
        // System.out.println("Volume of Cylinder : "+c.volume(r1,h1) );  
        
        // Problem 5

        c.setRadiusOfSphere(25);
        System.out.println("Radius of Sphere: "+c.getRadiusOfSphere());

    }
}
