package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex1 {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        Student st1 = new Student("Valusha",27,3,7.8);
        Student st2 = new Student("Tony",22,4,9.0);
        Student st3 = new Student( "Sam",25,1,6.3);
        Student st4 = new Student("Stive",18,2,8.4);
        Student st5 = new Student("Bakki",33,3,9.9);


        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        System.out.println(list);

        Collections.sort(list);
        System.out.println(" - - - - - - - - - - - - - - - - ");
        System.out.println("Sorted by name, with Comparable");
        System.out.println(list);

        list.sort(new avgSorted());
        System.out.println(" - - - - - - - - - - - - - - - - ");
        System.out.println("Sorted by avgGrade");
        System.out.println(list);


        Collections.sort(list,new nameSorted());
        System.out.println(" - - - - - - - - - - - - - - - - ");
        System.out.println("Sorted by name");
        System.out.println(list);

    }

}


class Student implements Comparable<Student>{
    String name;
    int age;
    int course;
    double avgGrade;

    public Student(String name, int age, int course, double avgGrade) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}' + '\n';
    }

    @Override
    public int compareTo(Student s) {
        return this.age - s.age;
    }
}


class avgSorted implements Comparator<Student>{


    // Smart method
    @Override
    public int compare(Student t1, Student t2) {
        return Double.compare(t1.avgGrade, t2.avgGrade);
    }

    // Dumb method))
//    public int compare(Student t1, Student t2) {
//        if (t1.avgGrade < t2.avgGrade){
//            return -1;
//        }else if (t2.avgGrade < t1.avgGrade){
//            return 1;
//        }else return 0;
//    }

}


class nameSorted implements Comparator<Student>{

    @Override
    public int compare(Student t1, Student t2) {
        return t1.name.compareTo(t2.name);
    }
}