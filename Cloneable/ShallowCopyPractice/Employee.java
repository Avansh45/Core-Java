package ShallowCopyPractice;

public class Employee implements Cloneable{
    private int id;
    private String name;
    Department dept;

    
    public Employee(int id, String name, Department dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{

        return super.clone();
    }

    @Override
    public String toString() {
        return "Employee Id = " + id + ", Name = " + name + ", Dept = " + dept.name;
    }

    
}
