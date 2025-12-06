package StreamAPI.CollectorsInStreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Convert a list of objects into a list of one of their fields (e.g., Person::getName) using streams.

class Person{
    String name;
    int age;
    String city;

    Person(String name, int age , String city){
        this.name = name;
        this.age = age;
        this.city =city;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getCity(){
        return city;
    }
}
public class ObjectsTolist {
    public static void main(String[] args) {
        
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Amit",25,"Sarore"));
        persons.add(new Person("Akshit",25,"Jewal"));
        persons.add(new Person("Parth",20,"Bishnah"));

        List<String> nameList = persons.stream().map(Person::getName).collect(Collectors.toList());
        System.out.println(nameList);
    }
}
