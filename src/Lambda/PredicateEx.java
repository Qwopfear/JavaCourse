package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {

    public static void main(String[] args) {

        Employee e1 = new Employee("Anton",22,1000);
        Employee e2 = new Employee("Alex",18,700);
        Employee e3 = new Employee("Marcin",45,4350);
        Employee e4 = new Employee("Xaver",23,8800);
        Employee e5 = new Employee("Jasmin",33,5500);
        Employee e6 = new Employee("Emilia",28,5300);
        Employee e7 = new Employee("Lexy",17,1300);
        Employee e8 = new Employee("Beverly",30,17800);
        Employee e9 = new Employee("Valentine",36,7220);

        List<Employee> salesEmp = new ArrayList<>();
        salesEmp.add(e1);
        salesEmp.add(e3);
        salesEmp.add(e5);
        Department salesDep = new Department("Sales",salesEmp);
        salesDep.addEmployee(e7);
        System.out.println(salesDep.showWorkers());


        Department engineersDep = new Department("Engineers");
        engineersDep.addEmployee(e2);
        engineersDep.addEmployee(e4);
        engineersDep.addEmployee(e6);
        System.out.println(engineersDep.showWorkers());
        System.out.println(engineersDep + " " + salesDep);


        Department digitalDep = new Department("Digital");
        digitalDep.addEmployee(e8);
        digitalDep.addEmployee(e9);


        System.out.println("-----------Predicate Example-----------");

        ArrayList<Employee> allEmployees = new ArrayList<>(digitalDep.showWorkers());
        allEmployees.addAll(engineersDep.showWorkers());
        allEmployees.addAll(salesDep.showWorkers());

        EmployeeTest info = new EmployeeTest();

        info.testEmployees(allEmployees, employee -> {

            return employee.getSalary() < 3000;});

    }

}

class EmployeeTest {
    void testEmployees(List<Employee> el, Predicate<Employee> pe){
        for (Employee e: el) {
            if (pe.test(e)){
                System.out.println(e);
            }
        }
    }

}
