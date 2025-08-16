

class Rectangle1{
    public double areaRectangle(double length,double width){

        return length*width;
    }

    public double perimeterRectangle(double length,double width){

        double P= 2*(length+width);
        return P;

    }


}
class Cuboid extends Rectangle1{

    double area ;
    double length,width,height;
   
    public void setLength(double length){
        
        this.length=length;
    }
    public void setWidth(double width){
        
        this.width=width;
    }
    public void setHeight(double height){
        
        this.height = height;
    }

    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
     public double areaCuboid(){
       area= 2 * (length * width + width * height + length * height);
        return area;
    }
    public double volumeCuboid(){
        double v=length*width*height;
        return v;
    }
    
    
}

public class PracticeOfInheritance {
    public static void main(String[] args) {
        // double length =9;
        // double width =5;
        Cuboid c = new Cuboid();
        // System.out.println("Area of Rectangle: "+c.areaRectangle(length,width));
        // System.out.println("Perimeter of Rectangle: "+c.perimeterRectangle(length,width));
        c.setLength(15);
        c.setWidth(8);
        c.setHeight(10);
        System.out.println("Length:"+c.getLength());
        System.out.println("Width:"+c.getWidth());
        System.out.println("Height:"+c.getHeight());
        System.out.println(c.areaCuboid());
        System.out.println(c.volumeCuboid());
        
    }
}
