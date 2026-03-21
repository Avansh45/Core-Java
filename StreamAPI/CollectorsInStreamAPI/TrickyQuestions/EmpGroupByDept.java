package StreamAPI.CollectorsInStreamAPI.TrickyQuestions;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
// Group Employees by Department
// Problem Statement:
// You have a list of Employee objects with
// name
// department
// salary
// Group employees by department.
// ✅ Use: Collectors.groupingBy(Employee::getDepartment)
class Employee{
    private String name;
    private String dept;
    private double salary;

    Employee(String name, String dept, double salary){
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public double getSalary() {
        return salary;
    }

}
public class EmpGroupByDept {
    public static void main(String[] args) {
        
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Abhi", "cse", 25000));
        empList.add(new Employee("Aki", "ece", 20000));
        empList.add(new Employee("Lokesh", "it", 27000));
        empList.add(new Employee("Bobby", "cse", 35000));
        empList.add(new Employee("Kuldeep", "ece", 26000));

        Map<String,List<String>> strList = empList.stream()
                .collect(Collectors.groupingBy(Employee::getDept,Collectors.mapping(Employee::getName , Collectors.toList())));
        System.out.println(strList);
    }
}
