package BasicLevel;

// Create a class Student with fields id, name, and marks. 
// Clone the object and check whether changing the cloned object’s name affects the original one.

class Student implements Cloneable {
    private int id;
    private String name;
    private double marks;

    Student(int id , String name , double marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setMarks(double marks){
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    @Override
    public String toString() {
        return "Student Id = " + id + ", Name = " + name + ", Marks = " + marks ;
    }

}

public class StudentMain {
    
    public static void main(String[] args) throws CloneNotSupportedException{
        

        Student s1 = new Student(12,"Sumit",86.2);

        Student s2 = (Student) s1.clone();
        s2.setName("Amit");
        System.out.println(s1);
        System.out.println();
        System.out.println(s2);
    }
}
