package WorkWithFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InOutStreamFileEx {
    public static void main(String[] args) {
        int memNumber = (int) (1 + (Math.random() * 2));
        try (FileInputStream input = new FileInputStream(
                "src/Mems/Pic"+ memNumber +  ".jpg");
            FileOutputStream output = new FileOutputStream(
                    "src/WorkWithFiles/Pic"+ memNumber + ".jpg")) {
            int chars;
            while ((chars=input.read()) != -1){
                output.write(chars);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
