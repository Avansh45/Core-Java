package StreamAPI.CollectorsInStreamAPI.TrickyQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Find Total Salary by Department
// Problem:
// From the employee list, calculate total salary per department.
// ✅ Use: Collectors.groupingBy(..., Collectors.summingDouble())
public class TotalSalaryByDept {
    public static void main(String[] args) {
        
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Abhi", "cse", 25000));
        empList.add(new Employee("Aki", "ece", 20000));
        empList.add(new Employee("Lokesh", "it", 27000));
        empList.add(new Employee("Bobby", "cse", 35000));
        empList.add(new Employee("Kuldeep", "ece", 26000));

        Map<String,Double> salarylist = empList.stream()
                .collect(Collectors.groupingBy(Employee::getDept,Collectors.summingDouble(Employee::getSalary)));

        System.out.println(salarylist);
    }
}
