package WorkWithFiles;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    static String link = "/home/vsevolod/Desktop/rubai.txt";
    public static void main(String[] args) throws IOException {

        String rubai =
                "У попа была собака.\n"+
                "Он ее любил.\n" +
                "Она сьела кусок мяса.\n" +
                "Он ее убил.\n";


        try (FileWriter writer = new FileWriter(link)) {
            for (int i = 0; i < rubai.length(); i++) {
                writer.write(rubai.charAt(i));
            }
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
