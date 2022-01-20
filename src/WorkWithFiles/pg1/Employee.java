package WorkWithFiles.pg1;

import java.io.Serializable;

public class Employee implements Serializable {
    static final long serialVersionUID = 2;
    String name;
    String surname;
    // if I need to hide information and don`t push it in file
    // use "transient" key-word
    transient int salary;
    int age;
    String department;

    public Employee(String name, String surname, int salary, int age, String department) {
        this.name = name;
        this.surname = surname;
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
