class Employee_Details  {
    int Salary;
    String name;

    public int getSalary(int n){
        return Salary;
    }

    public String getName(String s){
        return name;
    }
    public void setName(String a){
        name =a;
    }
}
public class Employee{
    public static void main(String[] args) {
        

        Employee_Details ed =new Employee_Details();
        System.out.println(ed.setName({"Avansh"}));
        System.out.println(ed.getName("Anshu"));
        System.out.println(ed.getSalary(250000));
    }
}
