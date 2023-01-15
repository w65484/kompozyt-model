import java.util.ArrayList;

interface IEmployee {
    void add(Employee x);
    void remove(Employee x);
    void getName();
    Float getSalary();
    boolean hasEmployees();
    ArrayList<Employee> getEmployees();
}

public class Employee implements IEmployee {
    protected String name;
    protected String surname;
    protected Float salary;

    Employee(String x, String y, Float z){
        this.name = x;
        this.surname = y;
        this.salary = z;
    }

    public void add(Employee x){
    }

    public void remove(Employee x){
    }

    public void getName() {
        System.out.println(this.name + " " + this.surname);
    }

    public Float getSalary(){
        return this.salary;
    }

    public boolean hasEmployees(){
        return false;
    }

    public ArrayList<Employee> getEmployees(){
        return new ArrayList<>();
    }
}