package Lambda;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;
    private List<Employee> staffMembers;
    private int quantityOfMembers;
    private int salaryOfDepartment;

    public Department(String name,List<Employee> employees){
        this.name = name;
        staffMembers = employees;
        quantityOfMembers = staffMembers.size();
    }
    public Department(String name){
        this.name = name;
        staffMembers = new ArrayList<>();
    }


    void addEmployee(Employee e){
        quantityOfMembers++;
        staffMembers.add(e);
        e.setDepartment(name);
    }

    void addEmployee(List<Employee> e){
        for (Employee employee : e) {
            quantityOfMembers++;
            staffMembers.add(employee);
            employee.setDepartment(name);
        }
    }
    void removeEmployee(Employee e){
        staffMembers.remove(e);
    }

    List<Employee> showWorkers(){
        return staffMembers;
    }


    int countSalary(){
        for (Employee e:
             staffMembers) {
            salaryOfDepartment += e.getSalary();
        }
        return salaryOfDepartment;
    }
    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", quantityOfMembers=" + quantityOfMembers +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getStaffMembers() {
        return staffMembers;
    }

    public void setStaffMembers(List<Employee> staffMembers) {
        this.staffMembers = staffMembers;
    }

    public int getQuantityOfMembers() {
        return quantityOfMembers;
    }

    public void setQuantityOfMembers(int quantityOfMembers) {
        this.quantityOfMembers = quantityOfMembers;
    }
}
