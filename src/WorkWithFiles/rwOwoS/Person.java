package WorkWithFiles.rwOwoS;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Person {


    String name,id;
    LinkedList<Car> personCars;

    static int index;

    public Person(String name){
        this.name = name;
        id = "P" + index;
        personCars = new LinkedList<>();
        index++;
    }

    void addNewCar(Car c) {
        personCars.add(c);
    }





    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", personCars=" + personCars +
                '}';
    }
}
