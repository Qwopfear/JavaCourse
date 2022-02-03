package StringExercise.Simple;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println(students("Ivanov", 5 , "Math"));
        System.out.println(students("Petrov", 7 , "Physics"));

    }

    static String students(String surname, int grade, String classes){

        return "Student: " +  surname + " grade: " + grade + " Class: " + classes;
    }
}
