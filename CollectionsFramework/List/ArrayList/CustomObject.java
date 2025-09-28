package CollectionsFramework.List.ArrayList;
import java.util.*;

// Create an ArrayList<Student> and add 5–6 students.
// Sort students by marks in ascending order using a Comparator.
// Print the list before and after sorting.
class Student{
    int marks;
    String name;

    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString(){
        return "Name : "+ name +", Marks : "+ marks;
    }
}

public class CustomObject {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Anshu", 80));
        students.add(new Student("Akshit", 85));
        students.add(new Student("Amit", 98));
        students.add(new Student("Lakhan", 65));
        students.add(new Student("Ram", 78));
        students.add(new Student("Deepak", 90)); // Added one more student

        System.out.println("--- List BEFORE Sorting ---");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("---------------------------\n");


        Collections.sort(students, (a, b) -> a.marks - b.marks);
        students.sort(Comparator.comparingInt((Student s) -> s.marks).reversed());
        System.out.println("--- List AFTER Sorting (by Marks Descending) ---");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("-------------------------------------");
        // students.sort(Comparator.comparingInt((Student s) -> s.marks));
        students.sort((s1, s2) -> s1.marks - s2.marks);


        System.out.println("--- List AFTER Sorting (by Marks Ascending) ---");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("-------------------------------------");
    }
}