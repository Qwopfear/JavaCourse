package WorkWithFiles.pg2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class SerializationEx1 {
    public static void main(String[] args) {
        try {
            ArrayList<String> emps;
            ObjectInputStream ios = new ObjectInputStream(
                    new FileInputStream("src/WorkWithFiles/pg1/emps.bin"));
          emps = (ArrayList) ios.readObject();
            System.out.println(emps);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
