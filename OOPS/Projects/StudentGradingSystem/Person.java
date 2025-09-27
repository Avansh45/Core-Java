package OOPS.Projects.StudentGradingSystem;

public abstract class Person {

    private String name;
    private int age;
    private char gender;

    //Here we are Initilization values at the time of object creation
    //If we know that the values are fixed then there is no need for setters
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Getters - To access the values for particular object(Student)
    // Without Getters we cannot access the values directly as they are privates
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public char getGender(){
        return gender;
    }

    //Values may need to change in future. so we can done by using setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    //Will be used to display the details of the person
    abstract void display();
    
}