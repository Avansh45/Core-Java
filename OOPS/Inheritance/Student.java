package OOPS.Inheritance;
//Refer main class for understanding
public class Student extends Person{
    String course;

    void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Course:"+course);
    }
}
