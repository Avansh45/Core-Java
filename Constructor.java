
class Employee{
    private String x ;
    private int s;
    Employee(String name){
        x=name;
        System.out.println(x);
    }
    Employee(){
        System.out.println("Default Constructor");
    }
    Employee(int salary){
        s= salary;
        System.out.println(salary);
    }
}

public class Constructor {
    public static void main(String[] args) {
        // Employee ep=new Employee("Anshu");
        Employee ep=new Employee();
        // Employee ep=new Employee(96);
    }
}
