package ShallowCopyPractice;

// Create a class Employee with fields id, name, and an object of another class Department.
//  Implement shallow copy and show how changing department details in the cloned object affects the original.

public class EmployeeMain {
    public static void main(String[] args) throws CloneNotSupportedException{
        Department dept = new Department();
        dept.name ="HR";
        Employee emp1 = new Employee(11, "Aarav", dept);
        emp1.dept.name =" Software Technologies";
        System.out.println(emp1);

        Employee emp2 = (Employee) emp1.clone();
        emp2.dept.name = " HardWare Technologies"; //Here ,It changes the original object also(Shallow copy)
        System.out.println(emp1);
        System.out.println(emp2);

    }
}
