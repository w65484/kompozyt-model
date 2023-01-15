import java.util.ArrayList;

public class Manager extends Employee {
    Manager(String x, String y, Float z){
        super(x,y,z);
    }
    private ArrayList<Employee> employees = new ArrayList<Employee>();

    public Float getSalary(){
        Float totalSalary = 0f;
        for(int i = 0; i < this.employees.size(); i++){
            totalSalary += this.employees.get(i).getSalary();
        }
        return totalSalary + this.salary;
    }

    public void add(Employee x){
        this.employees.add(x);
    }

    @Override
    public boolean hasEmployees(){
        if(this.employees.size() > 0) return true;
        return false;
    }

    public ArrayList<Employee> getEmployees(){
        return this.employees;
    }

    public void remove(String name, String surname){
        for(int i = 0; i < this.employees.size(); i++){
            Employee emp = this.employees.get(i);
            if(emp.hasEmployees()){
                ArrayList<Employee> otherEmp = emp.getEmployees();
                for(int j = 0; i < otherEmp.size(); j++){
                    this.employees.add(otherEmp.get(j));
                }
                this.employees.remove(emp);
                return;
            }
            this.employees.remove(emp);
        }
    }

    public void getName() {
        System.out.println(this.name + " " + this.surname);
        for(int i = 0; i < this.employees.size(); i++){
            this.employees.get(i).getName();
        }
    }

}