package StringExercise.Simple;

public class Ex5 {


    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new Employee("Ivan Petrov",1000),
                new Employee("Petr Ivanov", 15500),
                new Employee("Ilia Kuzmin", 13880)
        };
       String report = Report.generateReport(employees);

        System.out.printf("%15s",report);
    }
}


class Employee{
   private String fullName;
   private int salary;

    public Employee(String fullName, int salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }
}

class Report {
   static String generateReport(Employee[] employees){
       StringBuilder report = new StringBuilder();

       for (Employee e: employees) {
           report.append("Name : ").append(e.getFullName()).append("; Salary : ").
                   append(String.format("%7d", e.getSalary())).append('\n');
       }

        return String.valueOf(report);
    }
}