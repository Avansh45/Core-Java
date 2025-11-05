package StreamAPI;

import java.util.*;
// Create a Java program to find the average marks of students using Streams.
import java.util.stream.Collectors;

class Student{
    private int marks;
    private String name;
    private String dept;

    Student(int marks , String name, String dept){
        this.marks = marks;
        this.name = name;
        this.dept = dept;
    }

    public int getMarks(){
        return marks;
    }
    public String getName(){
        return name;
    }
    public String getDept(){
        return dept;
    }

    @Override
    public String toString() {
        return "Student [marks=" + marks + ", name=" + name + ", dept=" + dept + "]";
    }
    
}
public class MarksAverage {
    public static void main(String[] args) {
        
        List<Student> students = Arrays.asList(
            new Student(85,"Amit","CSE"),
            new Student(75,"Amrit","CSE"),
            new Student(95,"Sumit","ECE"),
            new Student(87,"Avika","CSE"),
            new Student(81,"Anshu","ECE")

        );

        double avgMarks = students.stream().mapToInt(s -> s.getMarks()).average().orElse(0.0);
        System.out.println(avgMarks);

        Map<String,Double> avgMarksByDepartments = students.stream().collect(Collectors.groupingBy(
            Student::getDept,
            Collectors.averagingInt(Student::getMarks)
        ));
        System.out.println(avgMarksByDepartments);
    }
}
