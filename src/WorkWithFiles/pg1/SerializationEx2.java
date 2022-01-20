package WorkWithFiles.pg1;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        Employee bestEmployee = new Employee("Seva","Pupkin",5000,20,"IT");
        try(ObjectOutputStream dop = new ObjectOutputStream(
                new FileOutputStream("src/WorkWithFiles/pg1/bestEmployee.bin"))){
            dop.writeObject(bestEmployee);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
