package WorkWithFiles.pg2;

import WorkWithFiles.pg1.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream( "src/WorkWithFiles/pg1/bestEmployee.bin"))){
            Employee bestEmploy = (Employee) ois.readObject();
            System.out.println(bestEmploy);
        }catch (IOException | ClassNotFoundException e ){
            e.printStackTrace();
        }
    }
}
