package WorkWithFiles.pg1;

import java.io.Serializable;

public class Employee implements Serializable {
    String name;
    int salary;
    int age;
    String department;

    public Employee(String name, int salary, int age, String department) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.department = department;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }
}
