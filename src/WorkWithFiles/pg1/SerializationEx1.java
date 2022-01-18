package WorkWithFiles.pg1;

import java.io.*;
import java.util.ArrayList;

public class SerializationEx1 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> emps = new ArrayList<>();
        emps.add("Alex");
        emps.add("Sam");
        emps.add("Dick");

        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("src/WorkWithFiles/pg1/emps.bin"));


        oos.writeObject(emps);

    }
}
